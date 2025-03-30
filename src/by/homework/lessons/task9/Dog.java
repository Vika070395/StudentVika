package by.homework.lessons.task9;

public class Dog extends Animal {
    String name;
    String breed;
    double averageWeight;

    public Dog(String color, int maxLongLife, String foodEat, String name, String breed, double averageWeight) {
        super(color, maxLongLife, foodEat);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public void bark() {
        System.out.println(name + " лает");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void play() {
        System.out.println(name + " играет");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public void makeSound() {
        System.out.println(name + " издает звук собаки");
    }

    @Override

    public String toString() {
        return "Собака: " + name + ", Порода: " + breed + ", Средний вес: " + averageWeight + ", " + super.toString();
    }


    public static void main(String[] args) {

        Dog dog = new Dog("Коричневый", 15, "мясо", "Ричь", "Кокер", 20);
        System.out.println(dog);

        dog.bark();
        dog.bite();
        dog.run();
        dog.jump();
        dog.play();
        dog.makeSound();
    }
}
