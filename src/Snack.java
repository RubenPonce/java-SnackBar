import VendingMachine.java;
public class Snack extends VendingMachine {
    // set fields
    // id
    // name
    // quantity
    // cost
    // vending machine id
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack(int vendingMachineId, String type,int id, String name, int quantity, double cost) {
        super(vendingMachineId, type);
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }
    public Snack (){
        super();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        String skittleMessage = "you have " + quantity + " " + this.name + " in your snack bag";
        System.out.println(skittleMessage);
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
            System.out.println("added " + quantity + " to your " + this.name + " bag!");
        this.quantity = quantity;
   
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the vendingId
     */
    public int getVendingId() {
        return vendingId;
    }

    /**
     * @param vendingId the vendingId to set
     */
    public void setVendingId(int vendingId) {
        this.vendingId = vendingId;
    }

     public int addToQuantity(int extraSnacks) {
        if(extraSnacks > 0 ){
            System.out.println("added " + extraSnacks + " to your " + this.name + " bag!");
           return this.quantity+= extraSnacks;
        } else{
            return this.quantity;
        }
    }
}