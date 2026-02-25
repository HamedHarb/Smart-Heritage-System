
package controller;
import model.Artifacts;
import view.ArtifactsView;
import Services .ArtifactsServices;
import Services .NotificationServices;


public class ArtifactsController {
    private Artifacts Artifacts;
    private ArtifactsView ArtifactsView;
     private ArtifactsServices as;
    private NotificationServices ns;
    
    public ArtifactsController(ArtifactsServices as,NotificationServices ns){
    this.as=as ;
    this.ns=ns;
    }
    public ArtifactsController(Artifacts Artifacts, ArtifactsView ArtifactsView) {
        this.Artifacts = Artifacts;
        this.ArtifactsView = ArtifactsView;
    }
    public void registerArtifacts(){
    ArtifactsView.showNotification("Artifacts Register successfulhy");
    }
    public void UpdateArtifactsStatus(String newStatus){
        Artifacts.UpdateStatus(newStatus);
        ArtifactsView.showNotification("Artifacts Updating successfulhy");
        ArtifactsView.DisplayArtifactsInfo(Artifacts);
    }
    public void trackArtifacts(){
    ArtifactsView.DisplayArtifactsInfo(Artifacts);
    }
}
