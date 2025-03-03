package by.homework.lessons.task5;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {

        // Ввести 2 положительных числа с консоли с помощью сканера.
        // Вывести сумму всех чисел от одного числа до другого.
        // (Используйте цикл while).
        // Подсказка. До цикла объявите переменную int sum=0.
        // В самом цикле перезаписывайте в эту переменную сумму чисел.

        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите положительное число 1");
        int number1 = in.nextInt();
        System.out.println("Ввведите положительное число 2");
        int number2 = in.nextInt();
//проверить являются ли числа положительными
        if (number1 <= 0 || number2 <= 0) {
            System.out.println("Одно из чисел отрицательное .Оба числа должны быть положительными.");

        } else {
            int sum = 0;
            int nash;            // если number1 меньше number2 , то суммирую от number1 до number2
            if (number1 < number2) {
                nash = number1;

                while (nash <= number2) {
                    sum += nash; // Добавляем текущее число к сумме
                    nash++; // Переходим к следующему числу

                }
                System.out.println("Сумма всех чисел от " + number1 + " до " + number2 + " равна: " + sum);
            } else {

                nash = number2;

                while (nash <= number1) {
                    sum += nash; // Добавляем текущее число к сумме
                    nash++;//ходим к следующему числу

                }
                System.out.println("Сумма всех чисел от " + number2 + " до " + number1 + " равна: " + sum);
            }
            in.close();
        }
    }
}