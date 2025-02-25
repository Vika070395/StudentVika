package by.homework.lessons.task3;

public class Number4 {
    public static void main(String[] args) {

        // Даны значения: x=5; y=2; c=x*y;
        // Расставьте операции инкремента декремента так,
        //    чтобы после выполнения операции (c=x*y)
        //    с равнялось 12, x=равнялось 6, y=1
        //    Выведите полученные значения в консоль.

        int x = 5;
        int y = 2;
        int c = ++x * --y ;
        c+=6;

        System.out.println("Значение с:" + c + " " + "значение x:" + x + " " + "значение y:" + y);
    }

}
