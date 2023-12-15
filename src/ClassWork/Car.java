package ClassWork;

public class Car {
    public int number;

    public boolean status;

    public Car(boolean status, int number){
        this.number=number;
        this.status = status;
    }
    public void go() throws BreakCar{
        if(!status){
            //System.out.println("Машина номер " + number + " сломана");
            return;
        }
        if((int)(Math.random()*10)>=8){
            status = false;
            throw new BreakCar();
        }
        else{
            //System.out.println("Машина номер "+number+ " поехала");
        }
    }
}
