import java.util.ArrayList;

public class Example {

    public static void main(String[] args)
    {
        ArrayList<Apartment> apartments = getExampleApartments();
        PaintVisitor paintVisitor = new PaintVisitor();

        for(Apartment apartment : apartments)
            apartment.accept(paintVisitor);

        paintVisitor.printRequests();
    }

    public static ArrayList<Apartment> getExampleApartments()
    {
        ArrayList<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneBedroom("1A", 1000));
        apartments.add(new OneBedroom("1B", 1000));
        apartments.add(new TwoBedroom("2A", 1300));
        apartments.add(new TwoBedroom("2B", 1300));
        apartments.add(new ThreeBedroom("3A", 2000));
        apartments.add(new ThreeBedroom("3B", 2000));
        return apartments;
    }
}
