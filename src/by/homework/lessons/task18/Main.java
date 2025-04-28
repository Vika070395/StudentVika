package by.homework.lessons.task18;

public class Main {

    public static void main(String[] args) {
        startTwoCars();       // Пункт 1.1 - 1.2
        startThreeCars();     // Пункт 1.3
    }

    private static void startTwoCars() {
        System.out.println("Запуск двух машин параллельно");

        Avto car1 = new Avto("Li", "0707-AB-7", 1000);
        Avto car2 = new Avto("Audi", "0505-CD-5", 1500);

        car1.start();
        car2.start();

        try {
            car1.join();
            car2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void startThreeCars() {
        System.out.println("Первая машина едет, потом две другие");

        Avto car1 = new Avto("BMW", "1515-BH-3", 1000);
        Avto car2 = new Avto("SUB", "0403-GH-4", 1000);
        Avto car3 = new Avto("KIA", "0808-IJ-8", 1000);

        car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        car2.start();
        car3.start();

        try {
            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
