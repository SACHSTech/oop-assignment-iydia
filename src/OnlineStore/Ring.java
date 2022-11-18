package OnlineStore;

public class Ring extends Items{
    private int size;
    private String material;
    private int quantity;
    private double price;

    public Ring(int size, int quantity, double price, String material) {
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

    public double getPrice() {
        return price;
    }
    
    public String getMaterial() {
        if (material == "1"){
            return "Sterling Silver";
        } else if (material == "2"){
            return "Gold";
        } else if (material == "3"){
            return "Platinum";
        }
        return material;
    }

    public String toString(){
        return quantity + " " + material + " ring(s) with " + size + "mm diameter ($" + Math.round(price * 100.0) / 100.0 + ")";
    }
}
