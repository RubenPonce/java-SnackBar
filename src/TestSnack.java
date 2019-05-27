import Snack.java;

public class TestSnack {
    public static void main(String[] args) {
        Snack snackerino = new Snack(1, "skittles", 2, 1.5, 1);
        System.out.println(snackerino.getQuantity());
        snackerino.setQuantity(50);
        snackerino.addToQuantity(40);
        System.out.println(snackerino.getQuantity());
    }
}