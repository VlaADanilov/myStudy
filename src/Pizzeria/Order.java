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

    public static Order makeOrder(Client client, Chef chef, String time, int number,TypesPizza type) throws NumbersExceptionОбр{
        Order order = new Order(client,chef,time,number,type);
        if(OrdersWithStatus.вОбработке[number-1]!=null){
            throw new NumbersExceptionОбр();
        }
        else{
            OrdersWithStatus.вОбработке[number-1]=order;
        }
        return order;
    }

    public String toString(){
        String ret = "";
        ret += "Заказ сделал(а) " + client.getName() +'\n';
        ret += "Заказ готовит " + chef.getName() +'\n';
        ret += "Заказ сделан в такое время: " + time +'\n';
        ret += "Номер заказа " + number +'\n';
        ret += "Статус заказа " + status +'\n';
        ret += "Пицца " + type +'\n';
        return ret;
    }

    public void updateStatus() throws NumberExceptionГотовится, NumberExceptionГотов{
        if(status==Status.Обработка){
            if(OrdersWithStatus.готовятся[number-1]!=null){
                throw new NumberExceptionГотовится();
            }
            else{
                OrdersWithStatus.готовятся[number-1]=OrdersWithStatus.вОбработке[number-1];
                OrdersWithStatus.вОбработке[number-1]=null;
            }
            status=Status.Готовится;
            return;
        }
        if(status==Status.Готовится){
            if(OrdersWithStatus.готовы[number-1]!=null){
                throw new NumberExceptionГотов();
            }
            else{
                OrdersWithStatus.готовы[number-1]=OrdersWithStatus.готовятся[number-1];
                OrdersWithStatus.готовятся[number-1]=null;
            }
            status=Status.Готов;
            return;
        }
        if(status==Status.Готов){
            OrdersWithStatus.готовы[number-1]=null;
            status=Status.Выдан;
        }
    }
}
