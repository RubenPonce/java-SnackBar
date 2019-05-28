import VendingMachine.java;
import Snack.java;
import Customer.java;
public class TestSnack {
    public static void main(String[] args) {
        Snack snackerino = new Snack(1, "Candy", 1, "skittles", 2, 1.5);
    //    snackerino.getName();
       snackerino.getQuantity();
       Customer Jane = new Customer(1, "Jane", 40);
       Jane.getCash();
       Jane.pay(snackerino.getCost(), snackerino.getName());
       
    }
}