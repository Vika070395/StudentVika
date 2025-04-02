package by.homework.lessons.task9;

public class Bird extends Animal {
    String family;
    int maxFlight;


    public Bird(String color, int maxLongLife, String foodEat, String family, int maxFlight) {
        super(color, maxLongLife, foodEat);
        this.family = family;
        this.maxFlight = maxFlight;
    }

    public void sing() {
        System.out.println(family + " поёт");
    }

    public void peck() {
        System.out.println(family + " клюет");
    }

    public void incubateEggs() {
        System.out.println(family + " высиживает птенцов");
    }

    public void play() {
        System.out.println(family + " играет");  //изменила на family
    }
    public String toString() {
        return "Птица: " + family + ", Максимальная высота полета: " + maxFlight + ", " + super.toString();
    }
    public static void main(String[] args) {

        Bird bird1 = new Bird("серый ", 5, "насекомые", "Воробей", 100);
        System.out.println(bird1);

        bird1.play();
        bird1.incubateEggs();
        bird1.peck();
        bird1.sing();

    }
}
