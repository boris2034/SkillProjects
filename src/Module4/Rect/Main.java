package Module4.Rect;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(15, 20);
        rect.w = 1;
        System.out.println(rect.getW() * rect.getH() == rect.getS());
    }
}
