package Module5.exercises;

public class MusicalInstrument {
    String name;
    String manufacturer;
    int price;

    public MusicalInstrument(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String info() {
        return name + manufacturer + price;
    }
}

class Stringed extends MusicalInstrument{
    int quantityOfStrings;

    public Stringed(String name, String manufacturer, int price, int quantityOfStrings) {
        super(name, manufacturer, price);
        this.quantityOfStrings = quantityOfStrings;
    }
    public String play(){
        return name + "sounds beautiful";
    }
}

class Percussion extends MusicalInstrument{
    int year;

    public Percussion(String name, String manufacturer, int price, int year) {
        super(name, manufacturer, price);
        this.year = year;
    }
    public String play(){
        return "Bump";
    }
}