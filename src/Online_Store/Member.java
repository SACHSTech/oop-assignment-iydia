package Online_Store;

public class Member extends User{
    private int rewards;

    public Member(String user, String pass, boolean memberTF, int points) {
        super(user, pass, memberTF, points);
        
    }

    // for every placeorder, rewardspoints += 10 * price or something
}
