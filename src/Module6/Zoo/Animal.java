package Module6.Zoo;

abstract public class Animal {
    public void print() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "I am an animal";
    }
}
