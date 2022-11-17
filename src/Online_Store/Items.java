package Online_Store;

public abstract class Items {
    private String name;

    public Items(String theName){
        name = theName;
    }
    
    /**
     * Getter method for the item's name
     * @return name of the item
     */
    public String getName(){
        return name;
    }

    // Abstract method for the item's size
    public abstract String getSize();

    // Abstract method for the item's quantity
    public abstract int getQuantity();

    // Abstract method for the item's price
    public abstract double getPrice();
}
