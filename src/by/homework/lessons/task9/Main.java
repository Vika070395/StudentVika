package by.homework.lessons.task9;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        // Создание собак
        Dog rish = new Dog("Коричневый", 12, "мясо", "Ричь", "Кокер", 20);
        Dog chappi = new Dog("Белый", 10, "мясо", "Чаппи", "Пудель", 10);
        Dog charlie = new Dog("Черный", 14, "мясо", "Чарли", "Лабрадор", 50);

        zoo.addAnimal(rish);
        zoo.addAnimal(chappi);
        zoo.addAnimal(charlie);
        // Создание птиц
        Bird bird1 = new Bird("Серый", 5, "насекомые", "Воробей", 15);
        Bird bird2 = new Bird("Сизый", 8, "зерно", "Голубь", 30);
        Bird bird3 = new Bird("Бурый", 25, "мясо", "Орёл", 200);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);




       // животные из зоопарка
        Animal[] zooAnimals = zoo.getAnimals();



        for (int i = 0; i < zooAnimals.length; i++) {
            Animal animal = zooAnimals[i];
            animal.makeSound();
            animal.play();

            System.out.println(animal);

    }}}
