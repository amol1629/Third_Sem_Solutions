package slip21;
public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingfan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingfan){
        this.ceilingfan=ceilingfan;
    }
    public void execute()
    {
        prevSpeed=ceilingfan.getSpeed();
        ceilingfan.high();
    }
    public void undo()
    {
        switch(prevSpeed)
        {
            case CeilingFan.LOW:ceilingfan.low();break;
            case CeilingFan.MID:ceilingfan.mid();break;
            case CeilingFan.HIGH:ceilingfan.high();break;
            case CeilingFan.OFF:ceilingfan.off();break;
        }
    }
} 
