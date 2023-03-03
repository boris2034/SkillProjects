package Module5;

public class Point {
    private double x, y;
    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.print("Point with coords " + x + ", " + y);
    }
}

class ColorPoint extends Point {
    private int color;
    public ColorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }
    public void print(){
        // Печатаем координаты
        super.print();
        // Печатаем цвет
        System.out.println("and color " + color);
    }
}
