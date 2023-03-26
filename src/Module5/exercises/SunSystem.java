package Module5.exercises;

public class SunSystem extends StarSystem {
    private long population;

    public SunSystem(String starName, int quantityOfPlanets, int age) {
        super("Sun", quantityOfPlanets, age);
        this.population = population;
    }

    public String getInfo() {
        return "This is the most densely populated star system in the universe(probably).";
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
