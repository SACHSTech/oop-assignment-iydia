package Online_Store;

public abstract class Items {
    private int itemNumber;

    /**
     * Abstract parent class Items with properties that its subclasses share; and itemNumber
     * @param itemNumber the item number (not amount)
     */
    public Items(int itemNumber){
        this.itemNumber = itemNumber;
    }
    
    /**
     * Getter method for the item's item number
     * @return item number of the item
     */
    public int getItemnumber(){
        return itemNumber;
    }

    // Abstract method for the item's quantity
    public abstract int getQuantity();

    // Abstract method for the item's price
    public abstract double getPrice();

    // Abstract method for the item's material
    public abstract String getMaterial();

    /**
     * Method to list all products to the user
     */
    public static void listProducts(){
        
    }
    
}
