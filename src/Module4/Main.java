package Module4;

public class Main {
    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
//создали "большую кошку"
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
//создали "маленькую кошку"
        bigCat.setName("Pushok");
        System.out.println("The name of big cat is " + bigCat.getName());
        System.out.println("The name of small cat is " + smallCat.getName());
    }
}
