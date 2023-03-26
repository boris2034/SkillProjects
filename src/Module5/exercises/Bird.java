package Module5.exercises;

public class Bird {
    private String type;
    private String[] continents;
    private int population;

    public Bird(String type, String[] continents, int population) {
        this.type = type;
        this.continents = continents;
        this.population = population;
    }
}

class Pigeon extends Bird {
    int hunger;

    public Pigeon(String type, String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;
    }
    public void askForSeeds() {
        hunger -= 7;
        if (hunger <= 0) hunger = 0;
    }
    public void sleep() {
        hunger += 3;
    }

    public int getHunger() {
        return hunger;
    }
}
