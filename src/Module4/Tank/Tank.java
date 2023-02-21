package Module4.Tank;

public class Tank {
    private int x;
    private int y;
    private int dir;
    private int fuel;
    private int n;

    private static String MODEL = "T34";
    static int ntanks;

    public Tank() {
        this(0, 0, 100);
    }
    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }
    void goForward(int i) {
        if (fuel < i) i = fuel;
        else fuel -= i;
        if (dir == 0)  x += i;
        else if (dir == 1) y -= i;
        else if (dir == 2) x -= i;
        else y += i;
        }
    void goBackward(int i) {
        goForward(-i);
    }

    void turnRight(){
        dir ++;
        if (dir > 3) dir = 0;
    }

    void turnLeft() {
        dir --;
        if (dir < 0) dir = 3;
    }

    void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + n + " is at " + x + "," + y + " now");
    }

}
