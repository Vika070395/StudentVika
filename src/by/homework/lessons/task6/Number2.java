package by.homework.lessons.task6;

public class Number2 {
    public static void main(String[] args) {

//    Создать массив из 5 чисел и заполните этот массив вручную.
//    Создайте второй массив с размерностью больше на 1 чем первый массив.
// Необходимо скопировать первый массив со всеми значениями во второй массив.
// Последний элемент во втором массиве пусть будет 0.
// Выведите второй массив в консоль с помощью цикла for each.

        int[] massive1 = {5, 7, 3, 11, 20};

        //второй массив на один элемент больше
        int[] massive2 = new int[massive1.length + 1];
        //во второй массив копируем значения первого
        for (int i = 0; i < massive1.length; i++) {
            massive2[i] = massive1[i];
        }

        //задаем значение для последнего элемента во втором массиве
        massive2[massive2.length -1 ] = 7;

        System.out.println("Второй массив:");
        for (int number : massive2) {
            System.out.print(number + " "); // Выводим каждое число
        }
    }
}
