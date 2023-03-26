package Module5.exercises;

public class Aircraft {
    int number;
    int speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public double flight(int n) {
        return n;
    }
}

class Helicopter extends Aircraft {
    int screwDiameter, power;

    public Helicopter(int number, int speed, int screwDiameter, int power) {
        super(number, speed);
        this.screwDiameter = screwDiameter;
        this.power = power;
    }
}

class Aeroplane extends Aircraft {
    int wingspan;

    public Aeroplane(int number, int speed, int wingspan) {
        super(number, speed);
        this.wingspan = wingspan;
    }
}

class Airplane extends Aeroplane {
    int power;

    public Airplane(int number, int speed, int wingspan, int power) {
        super(number, speed, wingspan);
        this.power = power;
    }
}
