package good;

public class UserRepository {
    public void saveUser(User user) {
        System.out.println("User " + user.getName() + " data saved to databse");
    }
}
