package stok2;

public class Main {
    public static void main(String[] args){
        String[] s = {"a","ae","aek"};
        task1(s,5);
    }

    public static void task1(String[] strings, int k){
        // 1 подзадание
        int[] countes = new int[strings.length];

        for(int i = 0; i<strings.length; i+=1){
            countes[i]=countGl(strings[i]);
        }

        boolean flag = true;
        for(int i = 0; i<strings.length-1; i+=1){
            if(countes[i]>countes[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Массив строк отсортирован");

        //2 подзадание

        if(underTask2(strings, k)) System.out.println("k не превышает");


    }

    public static int countGl(String s){
        int k = 0;
        for(int i = 0; i<s.length(); i+=1){
            for(char a : new char[]{'a','e','i','y','u','o'}){
                if (s.charAt(i)== a){
                    k+=1;
                    break;
                }
            }
        }
        return k;
    }

    public static boolean underTask2(String[] strings, int k){
        int count = 0;
        for(int i = 1; i < strings.length-1; i+=1){
            if(strings[i].length()>strings[i-1].length()&&strings[i].length()>strings[i+1].length()) count+=1;
        }
        if (count<=k) return true;
        return false;
    }
}
