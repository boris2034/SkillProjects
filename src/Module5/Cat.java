package Module5;

public class Cat extends Animal {

    public Cat(){
        super(false, "Milk and meat");
    }
    public void sound(){
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Animal(false, "Meat");
        cat.printEats();

    }
}
