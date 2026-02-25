
package smartstreameditor;

import controller.ArtifactsController;
import model.Artifacts;
import view.ArtifactsView;

public class SmartStreamEditor {

  
    public static void main(String[] args) {
        Artifacts Artifacts = new Artifacts(10,"unll","Hamed");
        ArtifactsView sv = ArtifactsView();
        ArtifactsController ac =new ArtifactsController(Artifacts,sv);
        ac.registerArtifacts();
        ac.UpdateArtifactsStatus("newArtifactStatus");
        ac.trackArtifacts();
    }



   
    
}
