package Pizzeria;

import java.util.Locale;

public class Client extends Person {
    private CategoryDiscount categoryDiscount;
    private double discount;

    public Client(String name, Gender gender, int age, CategoryDiscount categoryDiscount) {
        super(name,gender,age);
        this.categoryDiscount = categoryDiscount;
        giveDiscount();
    }

    private void giveDiscount() {
        if (categoryDiscount.hisCategory.equals("Инвалид")) discount = 0.25;
        if (categoryDiscount.hisCategory.equals("Пенсионер")) discount = 0.15;
        if (categoryDiscount.hisCategory.equals("Ребёнок")) discount = 0.05;
    }

    @Override
    public String toString() {
        return "Клиент " + name + " . Клиенту " + age + " лет. " + "Пол клиента - " + gender
                + ". Скидка клиента - " + discount + ". Потому что он " + categoryDiscount + ".";
    }

    public CategoryDiscount getCategoryDiscount() {
        return categoryDiscount;
    }

    public void setCategoryDiscount(CategoryDiscount categoryDiscount) {
        this.categoryDiscount = categoryDiscount;
    }


}
