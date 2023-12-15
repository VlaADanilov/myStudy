package ForInterfase;

public class BableSort implements SortAlgoritm {

    public void order(Comparable[] array){
        for(int i = 0; i < array.length; i+=1){
            for(int j = 0; j < array.length-i-1; j+=1){
                if (array[j].compareTo(array[j+1]) > 0 ){
                    Comparable temp =  array[j + 1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
