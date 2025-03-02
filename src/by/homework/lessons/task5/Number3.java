package by.homework.lessons.task5;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
//        Ввести число с консоли, которое не заканчивается на 0.
//        Вывести число в обратном порядке. Использовать оператор %.
//        (цикл while,наподобие задачи, которую разбирали в конце занятия)


        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите  число, которое не заканчивается на 0");

        int number = in.nextInt();
        if (number % 10 == 0) {
            System.out.println("Число не должно заканчиваться на 0");

        } else {
        int numberback = 0; // Переменная для хранения перевернутого числа

        while (number != 0) {
            int extramenumber = number % 10;  // последня цифра числа
            numberback = numberback * 10 + extramenumber; // Добавляем цифру к перевернутому числу
            number /= 10; // Убираем последнюю цифру из исходного числа
        }

        System.out.println("Число в обратном порядке: " + numberback); // Выводим результат

        }
    }
}