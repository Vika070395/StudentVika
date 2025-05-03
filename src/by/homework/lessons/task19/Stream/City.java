package by.homework.lessons.task19.Stream;

public class City {

    private int id;
    private String name;
    private int population;
    private Continent continent;

    public City(int id, String name, int population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }


    public int getPopulation() {
        return population;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getName() {
        return name;
    }
}