package by.homework.lessons.task3;

public class Number2 {
    public static void main(String[] args) {
        //x=x+5; y=y*9; z=z-6;
        // Необходимо укоротить данные выражения, чтобы результат не изменился.
        // x=8; y=9; z=12; (операции присваивания, нужно просто написать по-другому)

        int x = 8;
        int y = 9;
        int z = 12;

        // Укороченные выражения
        x += 5; // x = x + 5
        y *= 9; // y = y * 9
        z -= 6; // z = z - 6

        System.out.println("Значение x: " + x);
        System.out.println("Значение y: " + y);
        System.out.println("Значение z: " + z);
    }
}

