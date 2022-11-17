package Online_Store;

public abstract class Items {
    private String name;

    public Items(String name){
        this.name = name;
    }
    
    /**
     * Getter method for the item's name
     * @return name of the item
     */
    public String getName(){
        return name;
    }

    // Abstract method for the item's quantity
    public abstract int getQuantity();

    // Abstract method for the item's price
    public abstract double getPrice();

    // Abstract method for the item's material
    public abstract String getMaterial();

    
}
