import VendingMachine.java;
import Snack.java;
import Customer.java;
public class TestSnack {
    public static void main(String[] args) {
        Snack snackerino = new Snack(1, "Candy", 1, "skittles", 2, 1.5);
       System.out.println(snackerino.getName());
    }
}