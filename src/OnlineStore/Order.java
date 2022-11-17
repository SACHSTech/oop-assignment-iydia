package OnlineStore;

public class Order {
    // Instance Variables
    private double total;
    private boolean placeOrder;
    private boolean isDelivered;
    private String orderStatus;

    public Order(double theTotal, String theOrderStatus){
        // do something like quantity = items.quantity();
        total = theTotal;
        orderStatus = theOrderStatus;
    }
}
