package OnlineStore;

public class Order {
    // Instance Variables
    private double subtotal;
    private double tax;
    private double total;
    private int totalQuantity;

    public Order(double subtotal, int totalQuantity){
        // do something like here is your order: and list in numbers and say enter that number if u wanna change anything
        this.subtotal = subtotal;
        this.totalQuantity = totalQuantity;
        total = subtotal * 1.13;
        tax = total * 0.13;
    }

    public int getTotalQuantity(){
        return totalQuantity;
    }

    public double getSubtotal(){
        return subtotal;
    }

    public double getTax(){
        return tax;
    }

    public double getTotal(){
        return total;
    }

    public String toString(){
        return "\nThere are " + totalQuantity + " item(s) in the bag\nSubtotal: $" + Math.round(subtotal * 100.0) / 100.0 + "\nTax: $" + Math.round(tax * 100.0) / 100.0 + "\nTotal: $" + Math.round(total * 100.0) / 100.0;

    }
}
