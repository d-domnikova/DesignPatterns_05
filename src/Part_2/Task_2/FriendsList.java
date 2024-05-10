package Part_2.Task_2;

import java.util.ArrayList;
import java.util.List;

public class FriendsList {
    private List<String> friends;

    public FriendsList() {
        this.friends = new ArrayList<>();
    }

    public List<String> getFriends() {
        return friends;
    }

    public void addFriend(String friend) {
        friends.add(friend);
    }
    public void removeFriend(String friend) {
        friends.remove(friend);
    }
}
