package bad;

public class Employee implements Worker {
    @Override
    public void work() {
        System.out.println("Employee works");
    }

    @Override
    public void eat() {
        System.out.println("Employee eats");
    }
}
