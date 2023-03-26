package Module6.Zoo;

public class Cat extends Animal implements Soundable{
    public void print(){
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public String toString() {
        return "I am a Cat";
    }
}
