package by.homework.lessons.task18.Runnable;

public class Main {
    public static void main(String[] args) {

        Thread car1 = new Thread(new Avto("BMW", "0008-BH-8", 1000));
        Thread car2 = new Thread(new Avto("AUDI", "0077-BB-7", 2500));

        car1.start();
        car2.start();

        try {
            car1.join();
            car2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
