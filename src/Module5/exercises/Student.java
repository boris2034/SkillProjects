package Module5.exercises;

public class Student extends Person{
    public int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void giveGrade(){}
    public void praise(){}
}
