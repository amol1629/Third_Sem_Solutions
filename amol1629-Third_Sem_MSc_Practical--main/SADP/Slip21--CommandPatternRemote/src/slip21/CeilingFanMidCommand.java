package slip21;
public class CeilingFanMidCommand implements Command{
    CeilingFan ceilingfan;
    int prevSpeed;

    public CeilingFanMidCommand(CeilingFan ceilingfan){
        this.ceilingfan=ceilingfan;
    }
    public void execute()
    {
        prevSpeed=ceilingfan.getSpeed();
        ceilingfan.mid();
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
