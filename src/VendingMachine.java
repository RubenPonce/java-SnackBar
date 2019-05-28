public class VendingMachine {
    private int VendingMachineId;
    private String type;
    
    public VendingMachine(int VendingMachineId, String type){
        this.VendingMachineId = VendingMachineId;
        this.type = type;
    }


    

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Sring type) {
        this.type = type;
    }
    /**
     * @return the vendingMachineId
     */
    public int getVendingMachineId() {
        return VendingMachineId;
    }

    /**
     * @param vendingMachineId the vendingMachineId to set
     */
    public void setVendingMachineId(int vendingMachineId) {
        VendingMachineId = vendingMachineId;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


    
}