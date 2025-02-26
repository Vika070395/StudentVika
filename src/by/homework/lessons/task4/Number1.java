package by.homework.lessons.task4;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {

// На вход даны 3 числа. Вывести в консоль только четные
//числа
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите число 1");
        int number1 = in.nextInt();
        System.out.println("Ввведите число 2");
        int number2 = in.nextInt();
        System.out.println("Ввведите число 3");
        int number3 = in.nextInt();


        if (number1% 2 == 0) {
            System.out.println("четное число" + " " + number1 );
        }
        if (number2% 2 == 0) {
            System.out.println("четное число" + " " +number2);
        }
        if (number3 % 2 == 0) {
            System.out.println("четное число" + " "+ number3);
        }
    }
}