package by.homework.lessons.task4;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
//На вход даны 3 числа. Вывести в консоль только те числа,
//которые делятся на 2 и на 5
//(используйте оператор % для проверки деления без остатка)

        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите число 1");
        int number1 = in.nextInt();
        System.out.println("Ввведите число 2");
        int number2 = in.nextInt();
        System.out.println("Ввведите число 3");
        int number3 = in.nextInt();

        System.out.println("число, которое делится на 2 и на 5" + " : " );

        if (number1% 2 == 0 & number1% 5 == 0 ) {
            System.out.println( number1 );
        }
        if (number2% 2 == 0 & number2% 5 == 0) {
            System.out.println( +number2);
        }
        if (number3% 2 == 0 & number3% 5 == 0) {
            System.out.println(+ number3);
        }


    }

}
