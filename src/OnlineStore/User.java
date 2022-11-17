package OnlineStore;
import java.io.*;

public class User {
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));;
    
    // Instance Variables
    private String username;
    private String password;

    /**
     * Constructor that creates a new User instance
     * @param username username of the user
     * @param password password of the user
     */
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    // Constructor to initialize new user
    public User() {
        super();
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

    /**
     * String representation of a User
     * @return the username and password of a user
     */
    public String toString(){
        return "Your username is [" + username + "] and your password is [" + password + "]";
    }

    /**
     * Method to create an account and is called multiple times in main
     */
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
