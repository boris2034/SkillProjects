package Module2;

public class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.goAndSaveThePrincess();
    }

    public void goAndSaveThePrincess() {
        System.out.println("im go");
    }
}
