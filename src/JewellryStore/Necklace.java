package JewellryStore;

public class Necklace extends Items{
    private int size;
    private int quantity;
    private double price;
    private String material;

    /**
     * Necklace constructor extends and is a subclass of Items
     * @param size length in cm of the necklace
     * @param quantity amount of necklace(s) 
     * @param price price of necklace varying depending on the size/quantity
     * @param material material of the necklace, including Sterling Silver, Gold, Platinum
     */
    public Necklace(int size, int quantity, double price, String material) {
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    public String getMaterial() {
        return material;
    }

    /**
     * String representation of the necklace
     */
    public String toString(){
        return quantity + " " + material + " necklace(s) with " + size + "cm chain ($" + Math.round(price * 100.0) / 100.0 + ")";
    }
}
