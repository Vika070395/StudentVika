package by.homework.lessons.task10;

public class Main {

    public static void main(String[] args) {
        Dog rish = new Dog("Коричневый", 12, "мясо", "Ричь", "Кокер", 20);

        Dog chappi = new Dog("Белый", 10, "мясо", "Чаппи", "Пудель", 10);

        Bird bird1 = new Bird("Серый", 5, "насекомые", "Воробей", 15);
        Bird bird2 = new Bird("Бурый", 25, "мясо", "Орёл", 200);

        System.out.println(rish.equals(chappi));
        System.out.println(bird1.equals(bird2));

        System.out.println(rish.hashCode() == rish.hashCode());
        System.out.println(bird1.hashCode() == bird2.hashCode());
    }
}
