package Module5.exercises;

public class PedigreeCat extends Cat{
    private String breed;

    public PedigreeCat(String name, String owner, int age, String breed) {
        super(name, owner, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String toString() {
        return "The cat " + this.getName() + " is very beautiful, although she is now "
                + this.getAge() + " , she belongs to the breed " + breed + " , and her owner "
                + this.getOwner() + " is very proud of her.";
    }

    public static void main(String[] args) {
        PedigreeCat cat = new PedigreeCat("Bob", "Boris", 5, "Red");
        Cat catCat = new Cat("F", "Boriss", 11);
        System.out.println(catCat.getName());
        System.out.println(cat.toString());
    }
}
