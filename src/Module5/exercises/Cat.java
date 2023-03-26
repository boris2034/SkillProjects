package Module5.exercises;

public class Cat {
    private String name, owner;
    private int age;

    public Cat(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }
    public String toString(String string) {
        return "The cat " + name + " is already " + age + " . Her master " + owner + " takes care of her.";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
