package Online_Store;

public class User {
    // Instance Variables
    private static String username;
    private static String password;
    private static boolean isMember;

    public User(String user, String pass, boolean memberTF){
        username = user;
        password = pass;
        isMember = memberTF;

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

    /**
     * Getter method for whether the user is a member or not
     * @return whether the user is a member or not
     */
    public static boolean getMembershipStatus(){
        return isMember;
    }
}
