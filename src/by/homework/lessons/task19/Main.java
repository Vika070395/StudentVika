package by.homework.lessons.task19;

public class Main {

    public static void main(String[] args) {

        StringProcessor toUpperCase = input -> input.toUpperCase();

        String original = "привет, Кирилл!";
        String result = toUpperCase.process(original);

        System.out.println("Исходная строка: " + original);
        System.out.println("После обработки: " + result);
    }
}
