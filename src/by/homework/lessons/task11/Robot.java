package by.homework.lessons.task11;

public interface Robot {

    void turnOn();

    void turnOff();

    default void repairRobot() {
        System.out.println("Робот отремонтирован");
    }

    void uniquePossibility();
}
