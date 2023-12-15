package ClassWork;

public class Main {

    public static void main(String[] args) throws BreakCar {
        int k = 0;
        for(int i = 0; i<1000;i+=1){
            Cars cars = new Cars();
            for(int j = 0; j<10; j+=1){
                cars.goGo();
            }
            if(cars.check()==true){
                k+=1;
            }
        }
        System.out.println(k);
    }

}
