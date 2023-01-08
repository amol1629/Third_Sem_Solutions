package slip23;
public class HasQuarter implements State
{
    GumballMachine gumballMachine;
    public HasQuarter(GumballMachine gumballMachine)
    {
        this.gumballMachine=gumballMachine;
    }
    public void insertQuarter()
    {
        System.out.println("Twice Insertion not allowed");
    }
    public void ejectQuarter()
    {
        System.out.println("Quarter Ejected");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank()
    {
        System.out.println("Wait for gumball ...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }
    public void dispense()
    {
        System.out.println("No gumball came out");
    }
}

/*
Code By Vivek Raut
*/
