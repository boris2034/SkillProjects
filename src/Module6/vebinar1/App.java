package Module6.vebinar1;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        Rideable car2 = new Car("Lada", 29, true, 20);
       // System.out.println(car);
       // System.out.println(car2);
        Rideable boat = new Boat();
        boat.ride();
        car2.ride();
    }
}
