package Online_Store;
import java.io.*;

/**
 * Description: This program simulates an online checkout system for an online store.
 * The user can sign in, add items to their order, see the total, place an order, and track their order. 
 * They can view their billing address and see the status of their membership, for every purchase, they get some rewards points. 
 * These points can be used to redeem store credit and pay for future orders. 
 * Author: L. He
 */

 public class Main {
    // Import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    public static String user;
    public static String pass;
    static boolean accountCreated = false;
    static boolean confirmRedo = false;
    static int pageNum;

    public static void main(String[] args) throws IOException {

        // Print title
        System.out.println("\n〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣");
        System.out.println("〣 WELCOME TO THE ONLINE JEWELLRY STORE 〣");
        System.out.println("〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣〣");

        // Create account
        while(!accountCreated) {
            System.out.println("\nPlease create an account. ");
            accountCreation();
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
        System.out.println("\nWelcome, " + User.getUsername());
        System.out.println("\n(1) Shopping Bag");
        System.out.println("(2) My Account");
        System.out.println("\nEnter the number to access each page:"); // How to add a way to go back to this menu?
        pageNum = Integer.parseInt(keyboard.readLine());

        if(pageNum != -1){
            if(pageNum == 1){
                System.out.println("Shopping Bag: ");
            } else if(pageNum == 2){
                System.out.println("My Account: ");
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
        System.out.println("\nYour username is (" + User.getUsername() + ") and password is (" + User.getPassword() + ").");
    }
 }