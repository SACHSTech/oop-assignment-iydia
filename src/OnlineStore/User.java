package OnlineStore;
import java.io.*;

public class User {
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));;
    
    // Instance Variables
    private String username;
    private String password;
    public String email;

    /**
     * Constructor that creates a new User instance
     * @param username username of the user
     * @param password password of the user
     * @param email email of the user
     */
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /**
     * Getter method for the user's username 
     * @return user's username
     */
    public String getUsername(){
        return username;
    }

    /**
     * Setter method for the user's username
     * @param username a new username
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * Getter method for user's password
     * @return user's password
     */
    public String getPassword(){
        return password;
    }

    /**
     * Setter method for the user's password
     * @param password a new password
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Getter method for user's email
     * @return user's email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Setter method for user's email
     * @param email a new email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * String representation of a User
     * @return the username and password of a user
     */
    public String toString(){
        return "Username: " + username + "\nPassword: " + password + "\nEmail: " + email;
    }
}
