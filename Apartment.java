
public abstract class Apartment {
    public String aptNumber;
    public Integer sqFt;
    public Integer rent;

    public abstract void accept(BaseVisitor visitor);
}
