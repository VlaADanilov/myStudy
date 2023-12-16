package Pizzeria;

public enum TypesPizza {
    Cheese("Сырная"), Meet("Мясная"), Beach("Пляжная");

    private String type;

    TypesPizza(String type){
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
