package OnlineStore;

public abstract class Items {
    private int itemNumber;

    /**
     * Abstract parent class Items with properties that its subclasses share
     * @param itemNumber the item number (not quantity)
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

    /**
     * Abstract method for the item's quantity
     * @return quantity of the item
     */
    public abstract int getQuantity();

    /**
     * Abstract method for the item's price
     * @return price of the item
     */
    public abstract double getPrice();

    /**
     * Abstract method for the item's material
     * @return the material the item is made of
     */
    public abstract String getMaterial();
}
