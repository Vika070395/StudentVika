package by.homework.lessons.task12;

public class Vehicle {

    private String name;
    private Integer emissions;


    public Vehicle(String name, Integer emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для выбросов
    public Integer getEmissions() {
        return emissions;
    }

    // Сеттер для выбросов
    public void setEmissions(Integer emissions) {
        this.emissions = emissions;
    }
}
