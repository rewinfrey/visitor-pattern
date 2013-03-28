import java.util.ArrayList;

public class PaintVisitor implements BaseVisitor {
    public ArrayList<MaintenanceRequest> maintenanceRequests = new ArrayList<MaintenanceRequest>();

    public void visit(OneBedroom oneBedroom)
    {
        String paintAmount = "5 gallons";
        String msg = "This one-bedroom apartment requires " + paintAmount + " of paint.";
        MaintenanceRequest request = new MaintenanceRequest(oneBedroom.aptNumber, msg);
        maintenanceRequests.add(request);
    }

    public void visit(TwoBedroom twoBedroom)
    {
        String paintAmount = "10 gallons";
        String msg = "This two-bedroom apartment requires " + paintAmount + " of paint.";
        MaintenanceRequest request = new MaintenanceRequest(twoBedroom.aptNumber, msg);
        maintenanceRequests.add(request);
    }

    public void visit(ThreeBedroom threeBedroom)
    {
        String paintAmount = "20 gallons";
        String msg = "This three-bedroom apartment requires " + paintAmount + " of paint.";
        MaintenanceRequest request = new MaintenanceRequest(threeBedroom.aptNumber, msg);
        maintenanceRequests.add(request);
    }

    public void printRequests()
    {
        for(MaintenanceRequest request : maintenanceRequests) {
            System.out.println("Paint request for: " + request.aptNumber);
            System.out.println(request.message + "\n");
        }
    }
}
