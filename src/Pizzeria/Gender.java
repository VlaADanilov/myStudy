package Pizzeria;

public enum Gender {
    Man("Мужской"), Woman("Женский");

    String gender;

    @Override
    public String toString() {
        return gender;
    }

    Gender(String gender){
        this.gender = gender;
    }
}
