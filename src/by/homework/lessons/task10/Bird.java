package by.homework.lessons.task10;

import java.util.Objects;

public class Bird extends Animal  {

    String family;
    int maxFlight;


    public Bird(String color, int maxLongLife, String foodEat, String family, int maxFlight) {
        super(color, maxLongLife, foodEat);
        this.family = family;
        this.maxFlight = maxFlight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Bird bird = (Bird) obj;

        if (this.maxLongLife != bird.maxLongLife) return false;
        if (this.maxFlight != bird.maxFlight) return false;
        if (!Objects.equals(family, bird.family)) return false;
        return color != null && color.equals(bird.color);
    }

    @Override
    public int hashCode() {
        int result = maxLongLife + maxFlight+ family.hashCode()+ color.hashCode();
        return result;
    }
}
