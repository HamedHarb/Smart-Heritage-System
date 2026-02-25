
package Model;

public class Artifacts {
    public int artifactId;
    public String name;
    public String era;
    public double price; // القيمة التأمينية أو التكلفة كما في الصورة
    public boolean availability;

    public Artifacts(int artifactId, String name, String era, double price, boolean availability) {
        this.artifactId = artifactId;
        this.name = name;
        this.era = era;
        this.price = price;
        this.availability = availability;
    }

    

    public String getName() { return name; }

    public void displayDetails() {
        System.out.println("--- Artifact Details ---");
        System.out.println("ID: " + artifactId + " | Name: " + name);
        System.out.println("Era: " + era + " | Status: " + (availability ? "Available" : "Under Maintenance"));
        System.out.println(">> Launching Multimedia: Audio Guide & 3D AR Model...");
    }
}
