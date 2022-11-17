package OnlineStore;

public class Order {
    // Instance Variables
    private double total;
    private boolean placeOrder;
    private boolean isDelivered;
    private String orderStatus;

    public Order(double theTotal, String theOrderStatus){
        // do something like quantity = items.quantity();
        // do something like here is your order: and list in numbers and say enter that number if u wanna change anything
        total = theTotal;
        orderStatus = theOrderStatus;
    }
    
}
