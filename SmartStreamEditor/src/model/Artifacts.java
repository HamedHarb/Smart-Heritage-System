package model;

public class Artifacts {

    public int id;
    public String Status;
    public String VisitorsName;

    public Artifacts(int id, String Status, String VisitorsName) {
        this.id = id;
        this.Status = Status;
        this.VisitorsName = VisitorsName;
    }

    public void updateStatus(String NewStatus) {
        this.Status = NewStatus;
    }
    public String getVisitorsName(){
        String VisitorName1 = this.VisitorsName;
    }

    public void UpdateStatus(String newStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
