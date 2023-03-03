package Module5.vebinar1;

public class Car extends Transport {
    public String brand;
    public int horsePower;
    public boolean isAwd;
    float acceleration;

    public Car() {
        brand = "Mazda";
        horsePower = 1000;
        isAwd = false;
        acceleration = 10;
        type = "Car";
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    public void start() {
        System.out.println(brand + " was started");
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public void setAwd(boolean isAwd) {
        this.isAwd = isAwd;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public float countSpeed(float time) {
        return (100 / acceleration) * time;
    }

    public void ride( ) {
        System.out.println("Riding car");
    }
}
