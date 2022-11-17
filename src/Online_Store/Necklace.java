package Online_Store;

public class Necklace extends Items{
    private String size;
    private int quantity;
    private double price;

    public Necklace(String name, int quantity, double price) {
        super(name);
        this.quantity = quantity;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
}
