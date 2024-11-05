package bad;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveUser() {
        System.out.println("User data saved to database.");
    }

    public void generateReport() {
        System.out.println("Generating user report...");
    }
}
