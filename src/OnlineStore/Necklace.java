package OnlineStore;

public class Necklace extends Items{
    private String size;
    private String material;
    private int quantity;
    private double price;

    public Necklace(String size, int quantity, double price, String material) {
        super(quantity);
        this.size = size;
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

    public void setQuantity(int setQuantity){
        quantity = setQuantity;
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
}
