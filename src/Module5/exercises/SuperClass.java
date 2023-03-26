package Module5.exercises;

public class SuperClass {
    int d;

    SuperClass(int d) {
        this.d = d;
    }

    public void getD() {
        System.out.println(this.d);
    }
}

class SubClass extends SuperClass {
    SubClass(int d) {
        super(d + 1);
    }

    public static void main(String args[]) {
        SubClass s = new SubClass(1);
        SuperClass sup = new SuperClass(1);
        s.getD();
        System.out.println(sup.d);
    }
}