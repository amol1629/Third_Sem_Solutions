package slip8;
public class Sold implements State
{
    GumballMachine gumballMachine;
    public Sold(GumballMachine gumballMachine)
    {
        this.gumballMachine=gumballMachine;
    }
    public void insertQuarter()
    {
        System.out.println("Insertion not allowed");
    }
    public void ejectQuarter()
    {
        System.out.println("Quarter needs to be inserted!!!");
    }
    public void turnCrank()
    {
        System.out.println("Quarter Not Inserted!!!");
    }
    public void dispense()
    {
        gumballMachine.release();
        if(gumballMachine.getCount() > 0)
        {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else
        {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        
    }
}
