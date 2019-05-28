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
    public double getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(double cash) {
        this.cash = cash;
    }

    public void pay (double cost){
        if(this.cash >= cost){
            this.cash-= cost;
        } else{
            System.out.println("you don't have enough money! $" + this.cash + " is your current balance and your purchase costs " + cost);
        }
        
    }
    @Override
    public String toString() {
        return super.toString();
    }

}