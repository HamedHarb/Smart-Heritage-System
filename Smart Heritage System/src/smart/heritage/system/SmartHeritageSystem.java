
package smart.heritage.system;


public class SmartHeritageSystem {

   public String crowdingData;
   
   public void monitorCrowding() {
        this.crowdingData = "Moderate";
        System.out.println("[System] Monitoring crowding levels: " + crowdingData);
    }

    public void sendNotification(String message) {
        System.out.println("[Notification] To Visitor: " + message + " <<Extend>>");
    }
    public static void main(String[] args) {
   
        
        
        // أ. إنشاء النظام والمسؤول
        SmartHeritageGuideSystem system = new SmartHeritageGuideSystem();
        Admin curator = new Admin(10, "Sarah", "sarah@museum.com", 123456, 5000.0);

        // ب. إضافة قطعة أثرية (بناءً على كلاس The Artifact في الصورة)
        Artifact pharaohStatue = new Artifact(501, "Pharaoh Statue", "Ancient Egypt", 1000000.0, true);

        // ج. محاكاة رحلة الزائر (بناءً على Use Case Diagram)
        Visitor visitor = new Visitor(1, "Ahmed", "ahmed@email.com", 987654);
        
        System.out.println("=== Welcome to Smart Heritage Guide System ===");
        
        // 1. مراقبة الازدحام (نظام)
        system.monitorCrowding();
        
        // 2. عملية المسح (زائر)
        visitor.scanArtifact(pharaohStatue);
        
        // 3. مشاركة التجربة (تتضمن تضمين QR Code)
        visitor.shareExperience();
        
        // 4. إرسال تنبيه في حالة الازدحام (عملية ممتدة Extend)
        system.sendNotification("Crowded area detected near the Statue.");

        // 5. إدارة المحتوى (مسؤول)
        curator.updateMediaContent();
        
        System.out.println("\n[Status] Execution completed successfully in NetBeans Environment.");
    }
}
