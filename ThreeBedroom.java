
public class ThreeBedroom extends Apartment {

    ThreeBedroom(String aptNumber, Integer rent)
    {
        this.aptNumber = aptNumber;
        this.rent = rent;
        this.sqFt = 1700;
    }

    public void accept(BaseVisitor visitor)
    {
        visitor.visit(this);
    }
}
