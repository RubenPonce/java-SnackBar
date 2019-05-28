public class Customer {
    private int id;
    private String name;
    private double cash;

    public Customer(int id, String name, double cash) {
        this.id = id;
        this.name = name;
        this.cash = cash;
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
     * @return the cash
     */
    public void getCash() {
        System.out.println(this.name + " has $" + cash + " available");
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(double cash) {
        this.cash = cash;
    }

    public void pay (double cost, String vendingItem){
        if(this.cash >= cost){
            System.out.println(vendingItem + " costs $" + cost);
            this.cash-= cost;
            System.out.println(this.name + " buys " + vendingItem +  " and has $" + this.cash + " left.");
        } else{
            System.out.println("you don't have enough money! $" + this.cash + " is your current balance and your purchase costs " + cost);
        }
        
    }
    @Override
    public String toString() {
        return super.toString();
    }

}