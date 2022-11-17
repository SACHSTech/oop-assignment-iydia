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
        Necklace silverNecklace;

        // Variables
        String material;
        int pageNum = -1;
        int productsPageNum = -1;
        int necklacePageNum;
        boolean createdSilNecklace = false;
        boolean createdGoldNecklace = false;
        boolean createdSilRing = false;
        boolean createdGoldRing = false;

        // Print title
        System.out.println("\n-----------------------------------------");
        System.out.println("WELCOME TO THE JEWELLRY STORE");
        System.out.println("-----------------------------------------");
        System.out.println("\nPlease create an account. ");
        thisUser = createAccount();
        System.out.println("\n-----------------------------------------");
        System.out.println("Welcome, " + thisUser.getUsername());

        // Print menu where user can access the classes
        try{
            while(pageNum == -1){
                System.out.println("\n(1) Shop Products");
                System.out.println("(2) My Account");
                System.out.println("(3) Shopping Bag");
                System.out.println("\n-----------------------------------------");
                System.out.print("Enter a page number: ");
                pageNum = Integer.parseInt(keyboard.readLine());   
                if(pageNum == 1){
                    while(productsPageNum == -1) {
                        System.out.println("-----------------------------------------");
                        System.out.println("\nAll products: ");
                        System.out.println("(1) Shop necklaces");
                        System.out.println("(2) Shop rings");
                        System.out.println("\n-----------------------------------------");
                        System.out.print("Enter a page number: ");
                        productsPageNum = Integer.parseInt(keyboard.readLine());
                        if(productsPageNum == 1){
                            System.out.println("-----------------------------------------");
                            System.out.println("\nChoose a material for your necklace: ");
                            System.out.println("(1) Sterling Silver (Default)");
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
                            // Size cm calculation for toString
                            if (size == 2){
                                size = 40;
                            } else if (size == 3){
                                size = 50;
                            } else { // If user input is invalid, automatic size is the default size
                                size = 30;
                            }
                            System.out.print("How many would you like to purchase?: ");
                            int quantity = Integer.parseInt(keyboard.readLine());
                            double price = quantity * 24.99;
                            if(size == 2){  // Adds $2.99 to the price for every 10cm longer chain
                                price+=2.99;
                            } else if(size == 3){
                                price+=2.99*2;
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
                    }
                } else if(pageNum == 2){
                    System.out.println("-----------------------------------------");
                    System.out.println(thisUser.getUsername() + "'s Account");
                    System.out.println("\n" + thisUser.toString()); // add option to update information?
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

    /**
     * Method to create an account and is called multiple times in main
     */
    public static User createAccount() throws IOException{
        System.out.print("\nUsername: ");
        String user = keyboard.readLine();
        System.out.print("Password: ");
        String pass = keyboard.readLine();
        // Creates a new user with the user's input
        User userInput = new User(user, pass);
        return userInput;
    }
}