package by.homework.lessons.task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

    // Задача 1:
    public static String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return currentDate.format(formatter);
    }

    // Задача 2:
    public static String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a");
        return currentDateTime.format(formatter);
    }

    // Задача 3: Перевод String "2023-03-19 : 10:12:24 AM" в LocalDateTime
    public static LocalDateTime parseStringToLocalDateTime1(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        return LocalDateTime.parse(dateString, formatter);
    }

    // Задача 4: Перевод String "пн 20.03.23 г. время: 15:07:28" в LocalDateTime
    public static LocalDateTime parseStringToLocalDateTime2(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd.MM.yy 'г. время:' HH:mm:ss");
        return LocalDateTime.parse(dateString, formatter);

    }
}
