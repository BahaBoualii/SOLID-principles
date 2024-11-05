package bad;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot works");
    }

    @Override
    public void eat() {
        // Not applicable, but forced to implement !!
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
