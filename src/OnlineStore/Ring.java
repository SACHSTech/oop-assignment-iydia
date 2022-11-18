package OnlineStore;

public class Ring extends Items{
    private int size;
    private int quantity;
    private double price;
    private String material;

    /**
     * Ring constructor extends and is a subclass of Items
     * @param size diameter in mm of the ring
     * @param quantity amount of ring(s)
     * @param price price of ring varying depending on the size/quantity
     * @param material material of the ring including Sterling Silver, Gold, Rose Gold
     */
    public Ring(int size, int quantity, double price, String material) {
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
     * String representation of the ring
     */
    public String toString(){
        return quantity + " " + material + " ring(s) with " + size + "mm diameter ($" + Math.round(price * 100.0) / 100.0 + ")";
    }
}
