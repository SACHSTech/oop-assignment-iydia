package OnlineStore;

public class Necklace extends Items{
    private int size;
    private String material;
    private int quantity;
    private double price;

    public Necklace(int size, int quantity, double price, String material) {
        super(quantity);
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

    public void setQuantity(int setQuantity){
        quantity = setQuantity;
    }

    public double getPrice() {
        return price;
    }
    
    public String getMaterial() {
        return material;
    }

    public String toString(){ // do some if statements to remove quantity 0 necklaces
        return "$" + price + ": " + quantity + " " + material + " necklace(s) with " + size + "cm chain";
    }
}
