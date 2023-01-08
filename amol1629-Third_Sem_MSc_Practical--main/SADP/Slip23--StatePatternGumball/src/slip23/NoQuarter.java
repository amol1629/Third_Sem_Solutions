package slip23;
public class NoQuarter implements State
{
    GumballMachine gumballMachine;
    public NoQuarter(GumballMachine gumballMachine)
    {
        this.gumballMachine=gumballMachine;
    }
    public void insertQuarter()
    {
        System.out.println("Quarter Inserted");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    public void ejectQuarter()
    {
        System.out.println("Quarter Not Inserted!!!");
    }
    public void turnCrank()
    {
        System.out.println("Quarter Not Inserted!!!");
    }
    public void dispense()
    {
        System.out.println("No gumball came out");
    }
}

/*
Code By Vivek Raut
*/
