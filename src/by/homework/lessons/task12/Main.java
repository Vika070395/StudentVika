package by.homework.lessons.task12;

public class Main {

    public static void main(String[] args) {

        // 2 обьекта класса Garage
        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        // Добавление автомобиля в  гараж 1
        garage1.addVehicle(new Car("BMW", 99));

        // Добавление мотоцикла в  гараж 2
        garage2.addVehicle(new Motorcycle("Harley", 101));

        // Проверка разрешения на въезд для автомобиля в первом гараже
        System.out.println("в первом гараже автомобиль: " + garage1.getVehicle().getName() +
                " - Разрешен ли въезд? " + (garage1.isEntryPermitted() ? "Да" : "Нет"));

        // Проверка разрешения на въезд для мотоцикла во втором гараже
        System.out.println("во втором гараже мотоцикт: " + garage2.getVehicle().getName() +
                " - Разрешен ли въезд? " + (garage2.isEntryPermitted() ? "Да" : "Нет"));
    }
    }


