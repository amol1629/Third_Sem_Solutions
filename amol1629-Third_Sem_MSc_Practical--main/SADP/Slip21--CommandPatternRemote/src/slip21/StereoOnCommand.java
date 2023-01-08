package slip21;
public class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo=stereo;
    }
    public void execute()
    {
        stereo.on();
        stereo.setCD();
    }
    public void undo(){
        stereo.off();
    } 
} 
