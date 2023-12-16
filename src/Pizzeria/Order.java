package Pizzeria;

public class Order {
    private Client client;
    private Chef chef;
    private String time;
    private int number;
    private Status status;
    private TypesPizza type;

    private Order(Client client, Chef chef, String time, int number, Status status, TypesPizza type) {
        this.client = client;
        this.chef = chef;
        this.time = time;
        this.number = number;
        this.status = status;
        this.type = type;
    }

    public static Order makeOrder(Client client, Chef chef, String time, int number, Status status, TypesPizza type){
        return new Order(client,chef,time,number,status,type);
    }

    public String toString(){
        String ret = "";
        ret = "Заказ сделал " + client.getName() +'\n';
        ret = "Заказ готовит " + chef.getName() +'\n';
        ret = "Заказ сделан в такое время: " + time +'\n';
        ret = "Номер заказа " + number +'\n';
        ret = "Стату заказа " + status +'\n';
        ret = "Пицца " + type +'\n';
        return ret;
    }
}
