package Module5.vebinar2;

public class Main {
    public static void main(String[] args) {
        Phone samPhone = new Phone("Samsung", "9139139139");
        Phone miPhone = new Phone("Mi", "9279279729");
        Phone huPhone = new Phone("Huawei", "1234567890");

        miPhone.call(samPhone);
        miPhone.hangCall();
        huPhone.call(samPhone);
        miPhone.call(huPhone);

    }
}

