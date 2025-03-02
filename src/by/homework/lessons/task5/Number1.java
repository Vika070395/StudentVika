package by.homework.lessons.task5;

public class Number1 {
    public static void main(String[] args) {

        //Вывести все числа кратные 7 или 3 в диапазоне от 1 до100.
        // (можно использовать цикл for)

        System.out.println("Числа, кратные 7 или 3 в диапазоне от 1 до 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

