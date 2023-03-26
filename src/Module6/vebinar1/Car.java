package Module6.vebinar1;

public class Car extends Transport implements Rideable {
    public String brand;
    public int horsePower;
    public boolean isAwd;
    public float acceleration;

    public Car() {
        this("Mazda", 200, false, 10);
    }
    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "Car";
    }
    float countSpeed(float time) {
        return (100 / acceleration) * time;
    }
    void start(){
        System.out.println(brand + " started");
    }
    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                ", isAwd=" + isAwd +
                ", acceleration=" + acceleration +
                ", type='" + type + '\'' +
                '}';
    }
    public void ride() {
        System.out.println("Riding " + brand);
    }
}
