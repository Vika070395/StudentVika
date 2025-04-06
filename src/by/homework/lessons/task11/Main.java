package by.homework.lessons.task11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // Создание экземпляров роботов
        RobotCook cookRobot = new RobotCook("Робот кулинар помощьник ", 1500, "Россия", "Электногриль");
        RobotSapper sapperRobot = new RobotSapper("Робот - Сапер", 1200, "IAI-123", "Металл");
        RobotBuilder builderRobot = new RobotBuilder("Робот- Строитель-", 2000, "Китай", "Бетономешалка", "Сталь");

        //Задание.1.1-1.4

        cookRobot.turnOn();
        cookRobot.uniquePossibility();
        cookRobot.repairRobot();
        cookRobot.turnOff();
        System.out.println("**********************");

        sapperRobot.turnOn();
        sapperRobot.uniquePossibility();
        sapperRobot.repairRobot();
        cookRobot.turnOff();
        System.out.println("**********************");

        builderRobot.turnOn();
        builderRobot.uniquePossibility();
        builderRobot.repairRobot();
        cookRobot.turnOff();
        System.out.println("**********************");

        //Задание 1.5-1.6
        Robot[] allRobots = { cookRobot, sapperRobot, builderRobot};
        RobotEngineer[] engineerRobots = {sapperRobot, builderRobot};
        RobotSapper[] sapperRobots = {sapperRobot};

        System.out.println("Способности всех роботов:");
        for (Robot robot : allRobots) {
            robot.turnOn();
            robot.uniquePossibility();
            robot.repairRobot();
            robot.turnOff();
        }
        System.out.println("**********************");

        System.out.println("Демонстрация создания предметов роботами-инженерами:");
        for (RobotEngineer engineer : engineerRobots) {
            engineer.createItem();
        }

    }
}
