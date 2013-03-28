
public class TwoBedroom extends Apartment {

    TwoBedroom(String aptNumber, Integer rent)
    {
        this.aptNumber = aptNumber;
        this.rent = rent;
        this.sqFt = 1200;
    }

    public void accept(BaseVisitor visitor)
    {
        visitor.visit(this);
    }
}
