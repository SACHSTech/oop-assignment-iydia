package Online_Store;
import java.io.*;

public class User {
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));;
    
    // Instance Variables
    private static String username;
    private static String password;

    public User(String user, String pass){
        username = user;
        password = pass;
    }

    public User() {
    }

    /**
     * Getter method for the user's username 
     * @return user's username
     */
    public String getUsername(){
        return username;
    }

    /**
     * Getter method for user's password
     * @return user's password
     */
    public String getPassword(){
        return password;
    }

    public String toString(){
        return "Your username is [" + username + "] and your password is [" + password + "]";
    }

    public void createAccount() throws IOException{
        System.out.println("\nUsername: ");
        String user = keyboard.readLine();
        System.out.println("\nPassword: ");
        String pass = keyboard.readLine();
        // Creates a new user with the user's input
        User userInput = new User(user, pass);
        System.out.println("\nYour username is [" + userInput.getUsername() + "] and password is [" + userInput.getPassword() + "].");
    }

}
