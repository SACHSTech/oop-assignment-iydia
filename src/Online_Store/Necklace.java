package Online_Store;

public class Necklace extends Items{
    private String size;
    private String material;
    private int quantity;
    private double price;

    public Necklace(String name, int quantity, double price, String material) {
        super(name);
        this.quantity = quantity;
        this.price = price;
        this.material = material;
    }

    public String getSize() {
        if (size == "S"){ // NOTE: change later to ignore uppercase/lowercase
            return "Small: 40cm";
        } else if (size == "M"){
            return "Medium: 50cm";
        } else if (size == "L"){
            return "Large: 60cm"; // LATER: add else statement
        }
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
            return "Silver";
        } else if (material == "2"){
            return "Gold";
        }
        return material;
    }
}
