package OnlineStore;
import java.io.*;
import java.util.ArrayList;

/**
 * Description: This program simulates an online checkout system for an online jewellry store.
 * Author: L. He
 */

 public class Main {
    static Order theOrder;
    
    // Import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));;

    public static void main(String[] args) throws IOException {
        ArrayList<String> shoppingBag = new ArrayList<String>( );

        // Variables
        String necklaceMaterial;
        String ringMaterial;
        int pageNum = -1;
        int productsPageNum = -1;
        int totalQuantity = 0;
        double subtotal = 0;

        // Title and account creation
        System.out.println("\nWELCOME TO THE JEWELLRY STORE");
        System.out.println("\nPlease create an account. ");
        System.out.print("\nUsername: ");
        String username = keyboard.readLine();
        System.out.print("Password: ");
        String password = keyboard.readLine();
        System.out.print("Email: ");
        String email = keyboard.readLine();
        User userInput = new User(username, password, email);
        System.out.println("\n-----------------------------------------");
        System.out.println("Welcome, " + userInput.getUsername());

        // Print main menu where user can access the classes
        try{
            while(pageNum == -1){
                System.out.println("\n(1) Shop Products");
                System.out.println("(2) My Account");
                System.out.println("(3) Shopping Bag");
                System.out.println("\n-----------------------------------------");
                System.out.print("Enter a page number: ");
                pageNum = Integer.parseInt(keyboard.readLine());   
                if(pageNum == 1){
                    System.out.println("-----------------------------------------");
                    System.out.println("All products: ");
                    System.out.println("\n(1) Shop necklaces");
                    System.out.println("(2) Shop rings");
                    System.out.println("\n-----------------------------------------");
                    System.out.print("Enter a page number: ");
                    productsPageNum = Integer.parseInt(keyboard.readLine());
                    if(productsPageNum == 1){
                        System.out.println("-----------------------------------------");
                        System.out.println("Choose a material for your necklace: ");
                        System.out.println("\n(1) Sterling Silver (Default)");
                        System.out.println("(2) Gold");
                        System.out.println("(3) Platinum");
                        System.out.println("\n-----------------------------------------");
                        System.out.print("Enter an option number: ");
                        int neckMaterial = Integer.parseInt(keyboard.readLine());
                        if(neckMaterial == 2){
                            necklaceMaterial = "Gold";
                        } else if(neckMaterial == 3){
                            necklaceMaterial = "Platinum";
                        } else { // If user input is invalid, automatic necklace material is the default material
                            necklaceMaterial = "Sterling Silver";
                        }
                        System.out.println("-----------------------------------------");
                        System.out.println("\nChoose a chain length: ");
                        System.out.println("(1) 30cm (Short) (Default)");
                        System.out.println("(2) 40cm (Medium)");
                        System.out.println("(3) 50cm (Long)");
                        System.out.println("\n-----------------------------------------");
                        System.out.print("Enter an option number: ");
                        int necklaceSize = Integer.parseInt(keyboard.readLine());
                        if (necklaceSize == 2){ // Size cm calculation for toString
                            necklaceSize = 40;
                        } else if (necklaceSize == 3){
                            necklaceSize = 50;
                        } else { // If user input is invalid, automatic size is the default size
                            necklaceSize = 30;
                        }
                        System.out.print("How many would you like to purchase?: ");
                        int necklaceQuantity = Integer.parseInt(keyboard.readLine());
                        double necklacePrice = (double)necklaceQuantity * 24.99;
                        if(necklaceSize == 40){  // Adds $2.99 to the price for every 10cm longer chain
                            necklacePrice += (2.99 * necklaceQuantity);
                        } else if(necklaceSize == 50){
                            necklacePrice += (2.99 * 2 * necklaceQuantity);
                        }
                        subtotal += necklacePrice;
                        Necklace necklaceOrder = new Necklace(necklaceSize, necklaceQuantity, necklacePrice, necklaceMaterial);
                        System.out.println("-----------------------------------------");
                        System.out.println("\n" + necklaceOrder.toString() + " added to bag.");
                        totalQuantity += necklaceQuantity;
                        theOrder = new Order(subtotal, totalQuantity);
                        shoppingBag.add(necklaceOrder.toString());
                        System.out.println("Enter -1 to return to the menu:");
                        pageNum = Integer.parseInt(keyboard.readLine());
                    } else if(productsPageNum == 2){
                        System.out.println("-----------------------------------------");
                        System.out.println("Choose a material for your ring: ");
                        System.out.println("\n(1) Sterling Silver (Default)");
                        System.out.println("(2) Gold");
                        System.out.println("(3) Rose Gold");
                        System.out.println("\n-----------------------------------------");
                        System.out.print("Enter an option number: ");
                        int ringInputMaterial = Integer.parseInt(keyboard.readLine());
                        if(ringInputMaterial == 2){
                            ringMaterial = "Gold";
                        } else if(ringInputMaterial == 3){
                            ringMaterial = "Rose Gold";
                        } else { // If user input is invalid, automatic ring material is the default material
                            ringMaterial = "Sterling Silver";
                        }
                        System.out.println("-----------------------------------------");
                        System.out.println("\nChoose a ring size: ");
                        System.out.println("(1) Small: 16mm diameter, size 6");
                        System.out.println("(2) Medium : 17mm diameter, size 7 (Default)");
                        System.out.println("(3) Large: 18mm diameter, size 8");
                        System.out.println("\n-----------------------------------------");
                        System.out.print("Enter an option number: ");
                        int ringSize = Integer.parseInt(keyboard.readLine());
                        if (ringSize == 2){ // Size mm calculation for toString
                            ringSize = 17;
                        } else if (ringSize == 3){
                            ringSize = 18;
                        } else { // If user input is invalid, the automatic size is the default size
                            ringSize = 16;
                        }
                        System.out.print("How many would you like to purchase?: ");
                        int ringQuantity = Integer.parseInt(keyboard.readLine());
                        double ringPrice = (double)ringQuantity * 14.99;
                        if(ringSize == 17){  // Adds $0.49 to the price for every size up from size 6
                            ringPrice += (0.49 * ringQuantity);
                        } else if(ringSize == 18){
                            ringPrice += (0.49 * 2 * ringQuantity);
                        }
                        subtotal += ringPrice;
                        Ring ringOrder = new Ring(ringSize, ringQuantity, ringPrice, ringMaterial);
                        System.out.println("-----------------------------------------");
                        System.out.println("\n" + ringOrder.toString() + " added to bag.");
                        totalQuantity += ringQuantity;
                        theOrder = new Order(subtotal, totalQuantity);
                        shoppingBag.add(ringOrder.toString());
                        System.out.println("Enter -1 to return to the menu:");
                        pageNum = Integer.parseInt(keyboard.readLine());
                    } else if(productsPageNum == -1){
                        pageNum = -1;
                    }             
                } else if(pageNum == 2){
                    System.out.println("-----------------------------------------");
                    System.out.println(userInput.getUsername() + "'s Account");
                    System.out.println("\n" + userInput.toString()); // add option to update information?
                    System.out.println("\nEnter -1 to return to the menu:");
                    pageNum = Integer.parseInt(keyboard.readLine());    
                } else if(pageNum == 3){
                    System.out.println("-----------------------------------------");
                    System.out.println("\nShopping Bag: ");
                    System.out.println(theOrder.toString());
                    System.out.println(shoppingBag);
                    System.out.println("\nEnter -1 to return to the menu:");
                    pageNum = Integer.parseInt(keyboard.readLine());    
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Try again: ");
            pageNum = Integer.parseInt(keyboard.readLine());    
        }
    }
}