package bad;

public class Project {
    private BackendDeveloper backendDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    public void implement() {
        backendDeveloper.develop();
        frontendDeveloper.develop();
    }
}
