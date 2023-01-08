package slip8;
public class SoldOut implements State
{
    GumballMachine gumballMachine;
    public SoldOut(GumballMachine gumballMachine)
    {
        this.gumballMachine=gumballMachine;
    }
    public void insertQuarter()
    {
        System.out.println("Gumballs are SoldOut");
    }
    public void ejectQuarter()
    {
        System.out.println("Nothing to eject");
    }
    public void turnCrank()
    {
        System.out.println("Gumballs are SoldOut");
    }
    public void dispense()
    {
        System.out.println("Gumballs are SoldOut");
    }
}

/*
Code By Vivek Raut
*/
