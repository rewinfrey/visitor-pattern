import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class ExampleTest {

    PaintVisitor paintVisitor = new PaintVisitor();

    public OneBedroom oneBedroomFactory(String aptNumber, Integer rent)
    {
        return new OneBedroom(aptNumber, rent);
    }

    public TwoBedroom twoBedroomFactory(String aptNumber, Integer rent)
    {
        return new TwoBedroom(aptNumber, rent);
    }

    public ThreeBedroom threeBedroomFactory(String aptNumber, Integer rent)
    {
        return new ThreeBedroom(aptNumber, rent);
    }

    @Test
    public void oneBedroomPaintTest() {
        oneBedroomFactory("1A", 1000).accept(paintVisitor);
        MaintenanceRequest maintenanceRequest = paintVisitor.maintenanceRequests.get(0);
        assertEquals(maintenanceRequest.aptNumber, "1A");
        assertEquals(maintenanceRequest.message, "This one-bedroom apartment requires 5 gallons of paint.");
    }

    @Test
    public void twoBedroomPaintTest() {
        twoBedroomFactory("2A", 1500).accept(paintVisitor);
        MaintenanceRequest maintenanceRequest = paintVisitor.maintenanceRequests.get(0);
        assertEquals(maintenanceRequest.aptNumber, "2A");
        assertEquals(maintenanceRequest.message, "This two-bedroom apartment requires 10 gallons of paint.");
    }

    @Test
    public void threeBedroomPaintTest() {
        threeBedroomFactory("3A", 2000).accept(paintVisitor);
        MaintenanceRequest maintenanceRequest = paintVisitor.maintenanceRequests.get(0);
        assertEquals(maintenanceRequest.aptNumber, "3A");
        assertEquals(maintenanceRequest.message, "This three-bedroom apartment requires 20 gallons of paint.");
    }

    @Test
    public void collectionTest()
    {
        ArrayList<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(oneBedroomFactory("1A", 1000));
        apartments.add(twoBedroomFactory("2A", 1000));
        apartments.add(threeBedroomFactory("3A", 1000));

        for(Apartment apartment : apartments)
            apartment.accept(paintVisitor);

        assertEquals(paintVisitor.maintenanceRequests.size(), 3);
        assertEquals(paintVisitor.maintenanceRequests.get(0).aptNumber, "1A");
        assertEquals(paintVisitor.maintenanceRequests.get(0).message, "This one-bedroom apartment requires 5 gallons of paint.");
        assertEquals(paintVisitor.maintenanceRequests.get(1).aptNumber, "2A");
        assertEquals(paintVisitor.maintenanceRequests.get(1).message, "This two-bedroom apartment requires 10 gallons of paint.");
        assertEquals(paintVisitor.maintenanceRequests.get(2).aptNumber, "3A");
        assertEquals(paintVisitor.maintenanceRequests.get(2).message, "This three-bedroom apartment requires 20 gallons of paint.");
     }

}
