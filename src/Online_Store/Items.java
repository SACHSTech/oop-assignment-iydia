package Online_Store;

public class Items {
    private String name;
    private String size;
    private int quantity;
    private double price;

    public Items(String theName, String theSize, int theQuantity, double thePrice){
        name = theName;
        size = theSize;
        quantity = theQuantity;
        price = thePrice;
    }
    
    /**
     * Getter method for the item's name
     * @return name of the item
     */
    public String getName(){
        return name;
    }

    /**
     * Getter method for the item's size
     * @return size of the item
     */
    public String getSize(){
        return size;
    }

    /**
     * Getter method for the item's quantity
     * @return quantity of the item
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     * Getter method for the item's price
     * @return price of the item
     */
    public double getPrice(){
        return price;
    }
}
