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
        User thisUser = new User();

        // Variables
        boolean accountCreated = false;
        boolean confirmRedo = false;
        int pageNum = -1;
        int productsPageNum = -1;

        // Print title
        System.out.println("\n〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣");
        System.out.println("〣  WELCOME TO THE JEWELLRY STORE 〣");
        System.out.println("〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣");

        // User creates an account
        while(!accountCreated) {
            System.out.println("\nPlease create an account. ");
            thisUser.createAccount();
            while(!confirmRedo) {
                System.out.println("Please CONFIRM or REDO: ");
                String setAccount = keyboard.readLine();
                if(setAccount.equalsIgnoreCase("CONFIRM")) {
                    accountCreated = true;
                    confirmRedo = true;
                } else if(setAccount.equalsIgnoreCase("REDO")) {
                    thisUser.createAccount();
                }
            }
        }

        // Print menu where user can access the classes
        try{
            while(pageNum == -1){
                System.out.println("\nWelcome, " + thisUser.getUsername());
                System.out.println("\n(1) Shop Products");
                System.out.println("(2) My Account");
                System.out.println("(3) Shopping Bag");
                System.out.println("\nEnter the number to access each page. Enter -1 to return to the menu anytime:");
                pageNum = Integer.parseInt(keyboard.readLine());    
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Try again: ");
            pageNum = Integer.parseInt(keyboard.readLine());    
        }

        // Main menu page
        if(pageNum != -1){
            if(pageNum == 1){
                while(productsPageNum == -1) {
                    System.out.println("\nAll products: ");
                    System.out.println("(1) Shop necklaces");
                    System.out.println("(2) Shop rings");
                    System.out.println("\nEnter the number to shop each product: Enter -1 to return to the menu anytime"); 
                    productsPageNum = Integer.parseInt(keyboard.readLine());    
                }
            } else if(pageNum == 2){
                System.out.println("\nMy Account: ");
                System.out.println("\n" + thisUser.toString());
            } else if(pageNum == 3){
                System.out.println("\nShopping Bag: ");
            } else {
                pageNum = -1;
            }
        }

        // Products page
        if(productsPageNum != -1){
            if(productsPageNum == 1){
                System.out.println("\nAll necklaces: "); // keep working
            } else if(productsPageNum == 2){
                System.out.println("\nAll rings: "); // keep working
            }
        }
    }
}