package Pizzeria;

public enum Status {
    Обработка("Обработка"), Готовится("Готовится"), Готов("Готов"), Выдан("Выдан");

    private String status;

    Status(String status){
        this.status = status;
    }

    public String toString() {
        return status;
    }
}
