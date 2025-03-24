package by.homework.lessons.task8;

public class Number2 {

    public static String insertStringAfterIndex(String text, int k, String str) {
        String result = "";

        String[] words = text.split(" ");
        for (String word : words) {

            if (k < word.length()) {

                String modifiedWord = word.substring(0, k + 1) + str;
                result += modifiedWord + " ";
            } else {

                result += word + " ";
            }

            result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        int k = 2;
        String str = "++";
        String newText = insertStringAfterIndex(text, k, str);
        System.out.println(newText);
    }
}