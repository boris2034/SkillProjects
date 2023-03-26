package Module5;

public class Animal {
    private boolean vegetarian;
    private String eats;

    public Animal(){
        System.out.println("Creature was created as Animal!");
    }
    public Animal(boolean vegetarian, String eats){
        this.vegetarian = vegetarian;
        this.eats = eats;
    }
    public void sound(){
    }
    public void printEats() {
        System.out.println(eats);
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
}
