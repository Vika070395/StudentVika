package by.homework.lessons.task10;

import java.util.Objects;

public class Dog extends Animal {

    String name;
    String breed;
    double averageWeight;

    public Dog(String color, int maxLongLife, String foodEat, String name, String breed, double averageWeight) {
        super(color, maxLongLife, foodEat);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Dog dog = (Dog) obj;

            if (this.maxLongLife != dog.maxLongLife) return false;
            if (averageWeight != dog.averageWeight) return false;
            if (!Objects.equals(name, dog.name)) return false;
            return breed != null && breed.equals(dog.breed);
        }

        @Override
        public int hashCode() {
            int result = maxLongLife + (int) averageWeight + name.hashCode()+breed.hashCode();
            return result;
        }}