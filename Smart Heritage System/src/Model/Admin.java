package Model;

public class Admin {

    private double salary;

    public Admin(int id, String name, String email, int phone, double salary) {
        super(id, name, email, phone);
        this.salary = salary;
    }

    public void manageArtifacts() {
        System.out.println("[Admin] Managing museum artifacts...");
    }

    public void updateMediaContent() {
        System.out.println("[Admin] Multimedia content has been updated.");
    }
}
