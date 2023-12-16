package Pizzeria;

enum CategoryDiscount {
    Invalid("Инвалид"), Pensioner("Пенсионер"), Young("Ребёнок");

    String hisCategory;

    CategoryDiscount(String hisCategory){
        this.hisCategory=hisCategory;
    }
}
