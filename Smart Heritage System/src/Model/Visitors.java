


package Model;


public class Visitors {
    public String name;
    public String id;
    public String email;
    public double phone;

    public Visitors(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getVisitorsName() {
        return this.name;
    }
}
