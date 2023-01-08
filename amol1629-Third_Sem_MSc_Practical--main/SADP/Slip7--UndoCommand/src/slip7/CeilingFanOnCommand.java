package slip7;
public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingfan;
    int prevSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingfan){
        this.ceilingfan=ceilingfan;
    }
    public void execute()
    {
        prevSpeed=ceilingfan.getSpeed();
        ceilingfan.on();
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
