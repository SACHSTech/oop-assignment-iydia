package Online_Store;

public class User {
    // Instance Variables
    private static String username;
    private static String password;

    public User(String user, String pass){
        username = user;
        password = pass;
    }

    /**
     * Getter method for the user's username 
     * @return user's username
     */
    public static String getUsername(){
        return username;
    }

    /**
     * Getter method for user's password
     * @return user's password
     */
    public static String getPassword(){
        return password;
    }
    
}
