package slip6;
public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingfan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingfan){
        this.ceilingfan=ceilingfan;
    }
    public void execute()
    {
        prevSpeed=ceilingfan.getSpeed();
        ceilingfan.off();
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
