package Part_1;
import java.util.ArrayList;

public class UserListProcessor {
    private ArrayList<User> users;
    public UserListProcessor(ArrayList<User> user) {
        this.users = user;
    }
    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }
    public void processUser(User user){
        System.out.println("Processing user: " + user.getUsername());
        if (isAdmin(user)) {
            System.out.println("Admin user detected!");
        }
    }

    public boolean isAdmin(User user){
        return user.getUsername().contains("admin");
    }

    public int countAdminUsers() {
        AdminCount adminCount = new AdminCount();
        for (User user : users){
            if (isAdmin(user)){
                adminCount.increaseCount();
            }
        }
        return adminCount.getCount();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public String sendEmailToUser(User receiver) {
        for (User user : users){
            if (user.getUsername().equals(receiver.getUsername())){
                return "Email successfully sent to " + receiver.getEmail();
            }
        }
        return "Listed user doesn't found.";
    }
}