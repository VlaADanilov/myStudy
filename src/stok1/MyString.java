package stok1;

public class MyString {

    private char[] chars;

    MyString(){
        chars = null;
    }

    MyString(String string){
        chars = new char[string.length()];
        for(int i = 0; i<string.length();i+=1){
            chars[i]=string.charAt(i);
        }
    }

    public boolean biggerThan(MyString myString2){
        boolean flag = true;
        for(int i = 0; i<(Math.min(chars.length,myString2.getChars().length)); i+=1){
            if(chars[i]<myString2.getChars()[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean smallerThan(MyString myString2){
        boolean flag = true;
        for(int i = 0; i<(Math.min(chars.length,myString2.getChars().length)); i+=1){
            if(chars[i]>myString2.getChars()[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public MyString plus(MyString myString){
        MyString ret = new MyString();
        char[] ans = new char[chars.length+myString.getChars().length];
        for(int i = 0; i<chars.length; i+=1){
            ans[i]=chars[i];
        }
        for(int i = 0; i<myString.getChars().length;i+=1){
            ans[chars.length+i] = myString.getChars()[i];
        }
        ret.setChars(ans);
        return ret;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i<chars.length; i+=1){
            s+=chars[i];
        }
        return s;
    }

    public boolean equals(MyString myString){
        if(chars.length!=myString.getChars().length) return false;
        boolean flag = true;
        for(int i = 0; i<chars.length; i+=1){
            if(chars[i]!=myString.getChars().length) flag = false;
        }
        return flag;
    }

    public MyString inOneAndInTwo(MyString myString){
        char[] chars2 = myString.getChars();
        String ans = "";
        for(int i = 0; i<chars.length; i+=1){
            for (int j = 0; j<chars2.length; j+=1){
                if(chars[i]==chars2[j]){
                    ans+=chars[i];
                    chars2[j]=' ';
                    break;
                }
            }
        }
        return new MyString(ans);
    }
}
