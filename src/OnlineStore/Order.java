package OnlineStore;

public class Order {
    // Instance Variables
    private double subtotal;
    private boolean placeOrder;
    private boolean isDelivered;
    private String orderStatus;
    private int totalQuantity;

    public Order(double subtotal, int totalQuantity){
        // do something like quantity = items.quantity();
        // do something like here is your order: and list in numbers and say enter that number if u wanna change anything
        this.subtotal = subtotal;
        this.totalQuantity = totalQuantity;
    }

    public int getTotalQuantity(){
        return totalQuantity;
    }

    public double getTotalPrice(){
        return subtotal;
    }

    public String toString(){
        return "\nThere are " + totalQuantity + " item(s) in the bag\nSubtotal: $" + subtotal;

    }
}
