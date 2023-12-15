package stok1;

public class Main {
    public static void main(String[] args){

    }
    public static boolean inThere(int[] numbers, int[][] digits){
        int countForCheck = 0;
        for(int i = 0; i<=numbers.length-1; i+=1){
            boolean plus = false; // был ли плюс?
            // 1 условие
            for(int j = 0; j< digits.length; j+=1){
                if(numberInDigits(numbers[i],digits[j])){
                    countForCheck+=1;
                    plus = true;
                    break;
                }
            }
            if(plus==false&&i!=numbers.length-1){
                // 2 условие
                for(int j = 0; j< digits.length; j+=1){
                    if(numberInDigits(numbers[i+1],digits[j])){
                        countForCheck+=1;
                        break;
                    }
                }
            }
        }
        if(countForCheck==2) return true;
        return false;
    }

    public static boolean numberInDigits(int number, int[] digit){
        String numberStr = number + "";
        if(numberStr.length()>digit.length) return false;
        if( numberStr.length()==digit.length){
            boolean flag = true;
            for(int i = 0; i<=digit.length-1; i+=1){
                if(numberStr.charAt(i)!= (digit[i]+"").charAt(0)) {
                    flag = false;
                }
            }
            return flag;
        }
        int k = digit.length-numberStr.length();
        for(int p = 0; p<k; p+=1){
            boolean flag = true;
            int q = 0;
            for(int i = p; i<numberStr.length()+p; i+=1){
                if(numberStr.charAt(q)!= (digit[i]+"").charAt(0)) flag = false;
                q+=1;
            }
            if(flag==true) return true;
        }
        return false;
    }
}
