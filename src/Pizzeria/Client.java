package Pizzeria;

import java.util.Locale;

public class Client extends Person {
    private String categoryDiscount;
    private double discount;

    public Client(String name, Gender gender, int age, String categoryDiscount) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.categoryDiscount = categoryDiscount;
        giveDiscount();
    }

    private void giveDiscount() {
        if (categoryDiscount.toLowerCase(Locale.ROOT).equals("инвалид")) discount = 0.25;
        if (categoryDiscount.toLowerCase(Locale.ROOT).equals("пенсионер")) discount = 0.15;
        if (categoryDiscount.toLowerCase(Locale.ROOT).equals("ребёнок")) discount = 0.05;
    }

    @Override
    public String toString() {
        return "Клиент " + name + " . Клиенту " + age + " лет. " + "Пол клиента - " + gender
                + ". Скидка клиента - " + discount + ". Потому что он " + categoryDiscount + ".";
    }

    public String getCategoryDiscount() {
        return categoryDiscount;
    }

    public void setCategoryDiscount(String categoryDiscount) {
        this.categoryDiscount = categoryDiscount;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender.toString();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
