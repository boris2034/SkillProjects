package Module2.zafachi;

public class Perimeter {
    public static void main(String[] args) {
        double side = 5;
        System.out.println("Triangle area - " + triangleArea(side));
        System.out.println("Square area - " + squareArea(side));
        System.out.println("Circle area - " + circleArea(side));
    }
    public static double triangleArea(double a) {
        double area = 0;
        area = 0.5 * a;
        return area;
    }
    public static double squareArea(double a){
        double area;
        area = a*a;
        return area;
    }
    public static double circleArea(double a){
        double area;
        area = 3.14 * (a * a);
        return area;
    }
}
