package good;

public class Employee implements Workable, Eatable{
    @Override
    public void eat() {
        System.out.println("Employee eats");
    }

    @Override
    public void work() {
        System.out.println("Employee works");
    }
}
