package ClassWork;

public class Cars {
    private Car[] array;

    public Cars(){
        array = new Car[10];
        for(int i = 1; i<=10; i+=1){
            array[i-1]=new Car(true,i);
        }

    }

    public void goGo() throws BreakCar {
        for(int i = 0; i<10; i+=1){
            try{array[i].go();}
            catch(BreakCar e){
                //System.out.println(i+" сломана ");
            }
        }
    }

    public boolean check(){
        int k = 0;
        for(int i = 0;i<10;i+=1){
            if(array[i].status==true){
                k+=1;
            }
        }
        if(k>=4){
            return true;
        }
        return false;
    }
}
