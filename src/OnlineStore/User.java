package OnlineStore;
import java.io.*;

public class User {
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));;
    
    // Instance Variables
    private String username;
    private String password;
    public String user;
    public String pass;

    /**
     * Constructor that creates a new User instance
     * @param username username of the user
     * @param password password of the user
     */
    public User(String user, String pass){
        username = user;
        password = pass;
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
        return "Username: " + username + "\nPassword: " + password;
    }
}
