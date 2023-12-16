package Pizzeria;

public class Main {
    public static void main(String[] args) {
        IssueaNumber issuea = new IssueaNumber();

        Client one = new Client("Иван", Gender.Man, 32, CategoryDiscount.Invalid);
        Client two = new Client("Петя", Gender.Man, 7, CategoryDiscount.Young);
        Client three = new Client("Наташа", Gender.Woman, 23, CategoryDiscount.Basic);
        Client four = new Client("Тётя Клава", Gender.Woman, 73, CategoryDiscount.Pensioner);

        System.out.println(one);

        Chef chef1 = new Chef("Ахмед", Gender.Man, 42, 18);
        Chef chef2 = new Chef("Мария", Gender.Woman, 28, 5);
        Chef chef3 = new Chef("Денис", Gender.Man, 21, 1);

        System.out.println(chef1);

        Order order1 = Order.makeOrder(one, chef1, "11:20",issuea.next(),TypesPizza.Beach);
        Order order2 = Order.makeOrder(one, chef2, "11:40",issuea.next(),TypesPizza.Meet);
        Order order3 = Order.makeOrder(two, chef1, "13:00",issuea.next(),TypesPizza.Cheese);
        Order order4 = Order.makeOrder(two, chef1, "7:50",issuea.next(),TypesPizza.Beach);
        Order order5 = Order.makeOrder(two, chef1, "17:40",issuea.next(),TypesPizza.Meet);
        Order order6 = Order.makeOrder(two, chef3, "18:00",issuea.next(),TypesPizza.Beach);
        Order order7 = Order.makeOrder(two, chef1, "19:25",issuea.next(),TypesPizza.Cheese);
        Order order8 = Order.makeOrder(two, chef3, "20:23",issuea.next(),TypesPizza.Meet);
        Order order9 = Order.makeOrder(two, chef2, "12:56",issuea.next(),TypesPizza.Beach);
        Order order10 = Order.makeOrder(three, chef3, "13:13",issuea.next(),TypesPizza.Meet);
        Order order11 = Order.makeOrder(three, chef1, "9:42",issuea.next(),TypesPizza.Beach);
        Order order12 = Order.makeOrder(three, chef1, "20:28",issuea.next(),TypesPizza.Cheese);
        Order order13 = Order.makeOrder(four, chef2, "10:37",issuea.next(),TypesPizza.Meet);
        Order order14 = Order.makeOrder(four, chef2, "9:38",issuea.next(),TypesPizza.Cheese);
        Order order15 = Order.makeOrder(four, chef1, "18:53",issuea.next(),TypesPizza.Beach);

        Order[] orders = makeArray(order1,order2,order3,order4,order5,order6,order7,order8,order9,order10,order11,order12,order13,order14,order15);

        for(Order a: orders){
            a.setStatus(Status.Готовится);
        }

        for(Order a: orders){
            a.setStatus(Status.Готов);
        }

        for(Order a: orders){
            a.setStatus(Status.Выдан);
        }
    }

    public static Order[] makeArray(Order order1,Order order2,Order order3,Order order4,Order order5,
                                    Order order6,Order order7,Order order8,Order order9,Order order10,
                                    Order order11,Order order12,Order order13,Order order14,Order order15){
        return new Order[]{order1,order2,order3,order4,order5,order6,order7,order8,order9,order10,order11,order12,order13,order14,order15};
    }
}
