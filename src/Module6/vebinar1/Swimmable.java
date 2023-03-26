package Module6.vebinar1;

public interface Swimmable {
    long MAX_DIST = 1999;
    default void swim() {
        System.out.println("Swimming till " + MAX_DIST);
    }
}
