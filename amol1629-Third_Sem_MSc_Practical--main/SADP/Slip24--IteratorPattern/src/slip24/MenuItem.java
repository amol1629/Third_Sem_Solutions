package slip24;
public class MenuItem{
    String name;
    String description;
    boolean vegeterian;
    double price;

    public MenuItem(String name,String description,boolean vegeterian,double price)
    {
        this.name=name;
        this.description=description;
        this.vegeterian=vegeterian;
        this.price=price;
    }
    public String getName()
    {
        return this.name;
    }
    
    public String getDescription()
    {
        return this.description;
    }

    public double getPrice()
    {
        return this.price;
    }

    public boolean isVegeterian()
    {
        return this.vegeterian;
    }
}