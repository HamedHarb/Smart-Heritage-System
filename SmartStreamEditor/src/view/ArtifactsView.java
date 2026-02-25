
package view;

import model.Artifacts;
public class ArtifactsView {
    public void DisplayArtifactsInfo(Artifacts ship){
       System.out.println("Artifacts id :" +ship.id );
       System.out.println("Artifacts status :" +ship.Status );
       System.out.println("Artifacts visitorsName :" +ship.VisitorsName ); 
    }
    public void showNotification (String message){
         System.out.println(message);
    }
}
