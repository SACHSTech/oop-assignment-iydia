package OnlineStore;
import java.io.*;

/**
 * Description: This program simulates an online checkout system for an online jewellry store.
 * Author: L. He
 */

 public class Main {
    // Import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));;

    public static void main(String[] args) throws IOException {
        // Initialize User
        User thisUser;

        // Variables
        String material;
        int pageNum = -1;
        int productsPageNum = -1;
        boolean createdSilNecklace = false;

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
                        int necklaceMaterial = Integer.parseInt(keyboard.readLine());
                        if(necklaceMaterial == 2){
                            material = "Gold";
                        } else if(necklaceMaterial == 3){
                            material = "Platinum";
                        } else { // If user input is invalid, automatic necklace material is the default material
                            material = "Sterling Silver";
                        }
                        System.out.println("-----------------------------------------");
                        System.out.println("\nChoose a chain length: ");
                        System.out.println("(1) 30cm (Short) (Default)");
                        System.out.println("(2) 40cm (Medium)");
                        System.out.println("(3) 50cm (Long)");
                        System.out.println("\n-----------------------------------------");
                        System.out.print("Enter an option number: ");
                        int size = Integer.parseInt(keyboard.readLine());
                        if (size == 2){ // Size cm calculation for toString
                            size = 40;
                        } else if (size == 3){
                            size = 50;
                        } else { // If user input is invalid, automatic size is the default size
                            size = 30;
                        }
                        System.out.print("How many would you like to purchase?: ");
                        int quantity = Integer.parseInt(keyboard.readLine());
                        double price = (double)quantity * 24.99;
                        if(size == 40){  // Adds $2.99 to the price for every 10cm longer chain
                            price+=(2.99 * quantity);
                        } else if(size == 50){
                            price+=(5.98 * quantity);
                        }
                        Necklace userNecklace = new Necklace(size, quantity, price, material);
                        System.out.println("-----------------------------------------");
                        System.out.println("\n" + userNecklace.toString() + " added to bag.");
                        System.out.println("Enter -1 to return to the menu:");
                        pageNum = Integer.parseInt(keyboard.readLine());
                    } else if(productsPageNum == 2){
                        System.out.println("\nAll rings: "); // incomplete
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
                    if(createdSilNecklace == true){
                        //silverNecklace.toString();
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Try again: ");
            pageNum = Integer.parseInt(keyboard.readLine());    
        }
    }
}