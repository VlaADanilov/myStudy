package Pizzeria;

public class Order {
    private Client client;
    private Chef chef;
    private String time;
    private int number;
    private Status status;
    private TypesPizza type;

    private Order(Client client, Chef chef, String time, int number,TypesPizza type) {
        this.client = client;
        this.chef = chef;
        this.time = time;
        this.number = number;
        this.status = Status.Обработка;
        this.type = type;
    }

    public static Order makeOrder(Client client, Chef chef, String time, int number,TypesPizza type){
        return new Order(client,chef,time,number,type);
    }

    public String toString(){
        String ret = "";
        ret += "Заказ сделал(а) " + client.getName() +'\n';
        ret += "Заказ готовит " + chef.getName() +'\n';
        ret += "Заказ сделан в такое время: " + time +'\n';
        ret += "Номер заказа " + number +'\n';
        ret += "Стату заказа " + status +'\n';
        ret += "Пицца " + type +'\n';
        return ret;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
