package by.homework.lessons.task6;

public class Number1 {

    public static void main(String[] args) {
// Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль(выводите через цикл for each).
//Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each.

        int[] massive = {5, 7, 3, 11, 20, 6, 7, 2, 77, 10};

        // Выводим исходный массив в консоль
        for (int number : massive) {
            System.out.println(number + " "); // Выводим каждое число
        }
        System.out.println( );

        // Заменяем элементы с нечётными индексами на ноль
        for (int i = 0; i < massive.length; i += 2) {
            massive[i] = 0; // Заменяем элемент на ноль
        }
        // Выводим измененный массив в консоль
        System.out.println("Измененный массив:");

       for (int number : massive) {
           System.out.println( number + " ");
       }
}
}