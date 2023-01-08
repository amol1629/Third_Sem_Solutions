package slip8;
public class GumballMachine{
    private State noQuarter;
    private State hasQuarter;
    private State sold;
    private State soldOut;
    private int count ;
    private State currentState;

    GumballMachine(int count)
    {
        noQuarter=new NoQuarter(this);
        hasQuarter=new HasQuarter(this);
        sold=new Sold(this);
        soldOut=new SoldOut(this);
        this.count=count;
        currentState=noQuarter;
    }
    public int getCount()
    {
        return count;
    }
    public State getNoQuarterState()
    {
        return noQuarter;
    }
    public State getHasQuarterState()
    {
        return hasQuarter;
    }
    public State getSoldState()
    {
        return sold;
    }
    public State getSoldOutState()
    {
        return soldOut;
    }
    void setState(State state)
    {
        this.currentState=state;
    }
    void release()
    {
        System.out.println("A Gumball has arrived");
        if(count !=0)
        count--;
    }
    public void insertQuarter()
    {
        currentState.insertQuarter();
    }
    public void turnCrank()
    {
        currentState.turnCrank();
        currentState.dispense();
    }
    public void ejectQuarter()
    {
        currentState.ejectQuarter();
    }

    public String toString()
    {
        String state="..";
        if(currentState==noQuarter)
        state="Waiting for Quarter";
        else if(currentState==hasQuarter)
        state="Waiting to get its crank turned";
        else if(currentState==soldOut)
        state="Machine Empty";
        return "******BestMachinery .Inc******\nGumball Machine\nGumballs left:"+count+"\n"+state+"\n******************************";
    }
}
