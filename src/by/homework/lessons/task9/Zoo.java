package by.homework.lessons.task9;

public class Zoo {

    private Animal[] animals;
    private int count;

    public Zoo() {
        this.animals = new Animal[0];
        this.count = 0;
    }

    // Метод для добавления нового животного
    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[count + 1];
        for (int i = 0; i < count; i++) {
            newAnimals[i] = animals[i];
        }
        newAnimals[count] = animal;
        animals = newAnimals;
        count++;
    }

    // Метод для получения всех животных
    public Animal[] getAnimals() {
        return animals;
    }  }