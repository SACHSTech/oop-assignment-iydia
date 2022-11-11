package Online_Store;
import java.io.*;

/**
 * Author: Lydia He
 * Description: This program simulates an online checkout system for an online store.
 * The user can sign in, add items to their order, see the total, place an order, and track their order. 
 * They can view their billing address and see the status of their membership, for every purchase, they get some rewards points. 
 * These points can be used to redeem store credit and pay for future orders. 
 */

 public class Main {

    public static void main(String[] args) throws IOException {
        // Import BufferedReader

        // Title
        System.out.println("\n〣〣〣〣〣〣〣〣〣〣〣〣");
        System.out.println("〣 WELCOME TO SEPHORA 〣");
        System.out.println("〣〣〣〣〣〣〣〣〣〣〣〣");

        // Login
        Login();
    }
    
    private static void Login() throws IOException {
        boolean accountCreated = false;
        boolean confirmRedo = false;

        while(!accountCreated) {
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nPlease create an account. ");
            System.out.println("\nUsername: ");
            String username = keyboard.readLine();
            System.out.println("\nPassword: ");
            String password = keyboard.readLine();
            System.out.println("\nYour username is (" + username + ") and password is (" + password + ").");
            System.out.println("Please CONFIRM or REDO: ");
            String setAccount = keyboard.readLine();
            if(setAccount.equalsIgnoreCase("CONFIRM")) {
                accountCreated = true;
                confirmRedo = true;
            } else if (setAccount.equalsIgnoreCase("CONFIRM")) {
                
            }
        }
    }
 }