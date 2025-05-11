package by.homework.lessons.task21;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Выводим текущую дату
        System.out.println("Текущая дата: " + Date.getCurrentDate());

        // Выводим текущее время с датой
        System.out.println("Текущая дата и время: " + Date.getCurrentDateTime());

        String dateString1 = "2023-03-19 : 10:12:24 AM";
        LocalDateTime dateTime1 = Date.parseStringToLocalDateTime1(dateString1);
        System.out.println("Распарсенное LocalDateTime задачи 3: " + dateTime1);

        String dateString2 = "пн 20.03.23 г. время: 15:07:28";
        LocalDateTime dateTime2 = Date.parseStringToLocalDateTime2(dateString2);
        System.out.println("Распарсенное LocalDateTime задачи 4: " + dateTime2);
    }
}
