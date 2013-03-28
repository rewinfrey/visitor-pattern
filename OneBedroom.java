
public class OneBedroom extends Apartment {

    OneBedroom(String aptNumber, Integer rent)
    {
        this.aptNumber = aptNumber;
        this.rent = rent;
        this.sqFt = 800;
    }

    public void accept(BaseVisitor visitor)
    {
        visitor.visit(this);
    }
}
