package JewellryStore;

public abstract class Items {
    /**
     * Abstract parent class Items with methods that its subclasses share
     */
    public Items(){
    }
    
    /**
     * Abstract method for the items' size
     * @return size of the item
     */
    public abstract int getSize();

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

    /**
     * Abstract method for the String representation of an item
     */
    public abstract String toString();
}
