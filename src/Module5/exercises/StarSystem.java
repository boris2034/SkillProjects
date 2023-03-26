package Module5.exercises;

public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private int age;

    public StarSystem(String starName, int quantityOfPlanets, int age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }

    public String getInfo() {
        return starName + quantityOfPlanets + age;
    }

    public String getSarName() {
        return starName;
    }

    public void setSarName(String sarName) {
        this.starName = sarName;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
