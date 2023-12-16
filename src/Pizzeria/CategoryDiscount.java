package Pizzeria;

enum CategoryDiscount {
    Invalid("Инвалид"), Pensioner("Пенсионер"), Young("Ребёнок"), Basic("Нет категории");

    String hisCategory;

    CategoryDiscount(String hisCategory){
        this.hisCategory=hisCategory;
    }

    @Override
    public String toString() {
        return hisCategory;
    }
}
