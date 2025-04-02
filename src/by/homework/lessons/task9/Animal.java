package by.homework.lessons.task9;

public class Animal {
    String color;
    int maxLongLife;
    String foodEat;

    public Animal(String color, int maxLongLife, String foodEat) {
        this.color = color;
        this.maxLongLife = maxLongLife;
        this.foodEat = foodEat;
    }

    public void makeSound() {
        System.out.println("Животное здает звук");
    }

    public void play() {
        System.out.println("Животное играет");
    }

    @Override
    public String toString() {
        return "Цвет: " + color + ", Максимальная продолжительность жизни: " + maxLongLife + ", Тип еды: " + foodEat;
    }
}
