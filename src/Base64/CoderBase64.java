package Base64;

import java.io.UnsupportedEncodingException;

public class CoderBase64 {
    private static final String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    static String arrayToBase64(byte[] array){
        String ans = "";
        String[] four;
        String three;
        int p = 0;
        for(int i = 0; i<(array.length/3); i+=1){
            three = "";
            for(int j = 0; j <= 2; j += 1) {

                for(int y = 0; y < 8 - Integer.toBinaryString(array[p]).length(); y += 1) {
                    three += "0";
                }
                three += Integer.toBinaryString(array[p]);
                p+=1;
            }
            four = new String[]{"","","",""};
            int y = 0;
            for (int x = 0; x<=3; x+=1){
                while(y<6*(x+1)){
                    four[x]+=three.charAt(y);
                    y+=1;
                }
            }
            for(int x = 0; x<=3; x+=1){
                ans+=string.charAt(Integer.parseInt(four[x],2));
            }
        }
        if (array.length%3!=0) {
            if (array.length % 3 == 1) {
                String end = "0"+Integer.toBinaryString(array[array.length - 1]) + "0000";
                while(end.length()<12){
                    end="0"+end;
                }
                String[] two = new String[]{"",""};
                int y = 0;
                for (int x = 0; x <= 1; x += 1) {
                    while (y < 6 * (x + 1)) {
                        two[x] += end.charAt(y);
                        y += 1;
                    }
                }
                ans += string.charAt(Integer.parseInt(two[0], 2));
                ans += string.charAt(Integer.parseInt(two[1], 2));
                ans += "==";
            } else {
                String end = "";
                //String end = "0"+Integer.toBinaryString(array[array.length - 2]) +"0"+ Integer.toBinaryString(array[array.length - 1]) + "00";
                for(int i = 0;i<8-Integer.toBinaryString(array[array.length - 2]).length();i+=1){
                    end+="0";
                }
                end+=Integer.toBinaryString(array[array.length - 2]);
                for(int i = 0;i<8-Integer.toBinaryString(array[array.length - 1]).length();i+=1){
                    end+="0";
                }
                end+=Integer.toBinaryString(array[array.length - 1])+"00";
                String[] there = new String[]{"","",""};
                int y = 0;
                for (int x = 0; x <= 2; x += 1) {
                    while (y < 6 * (x + 1)) {
                        there[x] += end.charAt(y);
                        y += 1;
                    }
                }
                ans += string.charAt(Integer.parseInt(there[0], 2));
                ans += string.charAt(Integer.parseInt(there[1], 2));
                ans += string.charAt(Integer.parseInt(there[2], 2));
                ans += "=";
            }
        }
        return ans;
    }

    private static boolean ravnoNotInEnd(String str){
        boolean flag = true;
        for(int i = 0; i<str.length()-2; i+=1){
            if(str.charAt(i)=='='){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static int countRavno(String str){
        int k = 0;
        if(str.charAt(str.length()-2)=='=') k+=1;
        if(str.charAt(str.length()-1)=='=') k+=1;
        return k;
    }

    private static int indexOfChar(char a){
        for(int i = 0; i<64;i+=1){
            if(string.charAt(i)==a){
                return i;
            }
        }
        return 0;
    }

    static byte[] fromBase64ToArray(String str) throws Base64StringFormatException {
        if(str.length()%4!=0||!(str.matches("[\\dA-Za-z=/+]+"))||!CoderBase64.ravnoNotInEnd(str)){
            throw new Base64StringFormatException();
        }

        byte[] ans;

        switch(CoderBase64.countRavno(str)){
            case(0):

                ans=new byte[str.length()/4*3];
                int thereAnser = 0;
                int y = 0;
                while(y<str.length()) {
                    String[] four = new String[]{"", "", "", ""};
                    for (int i = 0; i < 4; i += 1) {
                        four[i] = Integer.toBinaryString(CoderBase64.indexOfChar(str.charAt(y)));
                        y+=1;
                        while(four[i].length()<6){
                            four[i] = "0" + four[i];
                        }
                    }
                    String[] three = new String[]{"", "", ""};
                    three[0] = four[0] + four[1].charAt(0) + four[1].charAt(1);
                    three[1] = four[1].charAt(2) + "" + four[1].charAt(3) + four[1].charAt(4) + four[1].charAt(5) + four[2].charAt(0) + four[2].charAt(1) + four[2].charAt(2) + four[2].charAt(3);
                    three[2] = four[2].charAt(4) + "" + four[2].charAt(5) + four[3];

                    ans[thereAnser] = (byte) Integer.parseInt(three[0], 2);
                    thereAnser += 1;
                    ans[thereAnser] = (byte) Integer.parseInt(three[1], 2);
                    thereAnser += 1;
                    ans[thereAnser] = (byte) Integer.parseInt(three[2], 2);
                    thereAnser += 1;
                }
                return ans;
            case(1):
                ans=new byte[str.length()/4*3-1];
                int whereYou = 0;
                int z = 0;
                while(whereYou<ans.length-2&&str.length()>4){
                    String[] four = new String[]{"", "", "", ""};
                    for (int i = 0; i < 4; i += 1) {
                        four[i] = Integer.toBinaryString(CoderBase64.indexOfChar(str.charAt(z)));
                        z+=1;
                        while(four[i].length()<6){
                            four[i] = "0" + four[i];
                        }
                    }
                    String[] three = new String[]{"", "", ""};
                    three[0] = four[0] + four[1].charAt(0) + four[1].charAt(1);
                    three[1] = four[1].charAt(2) + "" + four[1].charAt(3) + four[1].charAt(4) + four[1].charAt(5) + four[2].charAt(0) + four[2].charAt(1) + four[2].charAt(2) + four[2].charAt(3);
                    three[2] = four[2].charAt(4) + "" + four[2].charAt(5) + four[3];

                    ans[whereYou] = (byte) Integer.parseInt(three[0], 2);
                    whereYou += 1;
                    ans[whereYou] = (byte) Integer.parseInt(three[1], 2);
                    whereYou += 1;
                    ans[whereYou] = (byte) Integer.parseInt(three[2], 2);
                    whereYou += 1;
                }
                String[] three = new String[]{"","",""};
                for (int i = 0; i < 3; i += 1) {
                    three[i] = Integer.toBinaryString(CoderBase64.indexOfChar(str.charAt(z)));
                    z+=1;
                    while(three[i].length()<6){
                        three[i] = "0" + three[i];
                    }
                }
                String[] two = new String[]{"",""};
                two[0]=three[0]+three[1].charAt(0)+three[1].charAt(1);
                two[1]=three[1].charAt(2) + "" + three[1].charAt(3)+three[1].charAt(4)+three[1].charAt(5)+three[2].charAt(0)+
                        three[2].charAt(1)+three[2].charAt(2)+three[2].charAt(3);
                ans[whereYou] = (byte) Integer.parseInt(two[0], 2);
                whereYou += 1;
                ans[whereYou] = (byte) Integer.parseInt(two[1], 2);
                return ans;
            case(2):
                ans=new byte[str.length()/4*3-2];
                int amThere = 0;
                int x = 0;
                while(amThere<ans.length-1&&str.length()>4){
                    String[] four = new String[]{"", "", "", ""};
                    for (int i = 0; i < 4; i += 1) {
                        four[i] = Integer.toBinaryString(CoderBase64.indexOfChar(str.charAt(x)));
                        x+=1;
                        while(four[i].length()<6){
                            four[i] = "0" + four[i];
                        }
                    }
                    String[] three1 = new String[]{"", "", ""};
                    three1[0] = four[0] + four[1].charAt(0) + four[1].charAt(1);
                    three1[1] = four[1].charAt(2) + "" + four[1].charAt(3) + four[1].charAt(4) + four[1].charAt(5) + four[2].charAt(0) + four[2].charAt(1) + four[2].charAt(2) + four[2].charAt(3);
                    three1[2] = four[2].charAt(4) + "" + four[2].charAt(5) + four[3];

                    ans[amThere] = (byte) Integer.parseInt(three1[0], 2);
                    amThere += 1;
                    ans[amThere] = (byte) Integer.parseInt(three1[1], 2);
                    amThere += 1;
                    ans[amThere] = (byte) Integer.parseInt(three1[2], 2);
                    amThere += 1;
                }
                String[] two1 = new String[]{"","",""};
                for (int i = 0; i < 3; i += 1) {
                    two1[i] = Integer.toBinaryString(CoderBase64.indexOfChar(str.charAt(x)));
                    x+=1;
                    while(two1[i].length()<6){
                        two1[i] = "0" + two1[i];
                    }
                }
                String one = two1[0]+two1[1].charAt(0)+two1[1].charAt(1);
                ans[amThere] = (byte) Integer.parseInt(one, 2);
                return ans;
        }
        return null;
    }

    static String stringToBase64(String str){

        byte[] ans = new byte[str.length()];
        for(int i = 0; i<str.length(); i+=1){
            ans[i]=(byte) (str.charAt(i));
        }
        return arrayToBase64(ans);
    }

    static String stringFromBase64(String str) throws Base64StringFormatException {
        if(str.length()%4!=0||!(str.matches("[\\dA-Za-z=/+]+"))||!CoderBase64.ravnoNotInEnd(str)){
            throw new Base64StringFormatException();
        }
        byte[] ans = fromBase64ToArray(str);
        char charA;
        String ret = "";
        for(int i = 0; i<ans.length; i+=1){
            charA = (char) ans[i];
            ret+=charA;
        }
        return ret;
    }
}
