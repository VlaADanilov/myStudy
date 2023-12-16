package Pizzeria;

public class Chef extends Person{
    private int experience;

    Chef(String name, Gender gender, int age, int experience){
        super(name,gender,age);
        this.experience=experience;
    }

    @Override
    public String toString() {
        return "Повар " + name + ". Возраст - " + age + " лет , стаж - " + experience + " лет. Его пол " + gender ;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
