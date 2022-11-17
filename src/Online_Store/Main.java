package Online_Store;
import java.io.*;

/**
 * Description: This program simulates an online checkout system for an online jewellry store.
 * Author: L. He
 */

 public class Main {
    // Import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // Variables
        String user;
        String pass;
        boolean accountCreated = false;
        boolean confirmRedo = false;
        int pageNum = -1;

        // Print title
        System.out.println("\n〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣");
        System.out.println("〣  WELCOME TO THE JEWELLRY STORE 〣");
        System.out.println("〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣");

        // Create account
        while(!accountCreated) {
            System.out.println("\nPlease create an account. ");
            accountCreation();
            // make user newUser and set it either before each of the methods is called
            while(!confirmRedo) {
                System.out.println("Please CONFIRM or REDO: ");
                String setAccount = keyboard.readLine();
                if(setAccount.equalsIgnoreCase("CONFIRM")) {
                    accountCreated = true;
                    confirmRedo = true;
                } else if(setAccount.equalsIgnoreCase("REDO")) {
                    accountCreation();
                }
            }
        }

        // Class exploration
        while(pageNum == -1){
            System.out.println("\nWelcome");
            System.out.println("\n(1) Shopping Bag");
            System.out.println("(2) My Account");
            System.out.println("\nEnter the number to access each page. Enter -1 to return to the menu anytime:"); // How to add a way to go back to this menu?
            pageNum = Integer.parseInt(keyboard.readLine());    
        }

        if(pageNum != -1){
            if(pageNum == 1){
                System.out.println("\nShopping Bag: ");
            } else if(pageNum == 2){
                System.out.println("\nMy Account: ");
                //System.out.println("\n" + userInput.toString());
            }
        }
    }
    
    private static void accountCreation() throws IOException {
        System.out.println("\nUsername: ");
        String user = keyboard.readLine();
        System.out.println("\nPassword: ");
        String pass = keyboard.readLine();
        // Creates a new user with the user's input
        User userInput = new User(user, pass);
        System.out.println("\nYour username is [" + userInput.getUsername() + "] and password is [" + userInput.getPassword() + "].");
    }
 }