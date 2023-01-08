package slip6;
public class GarageDoorDownCommand implements Command{
    GarageDoor garagedoor;

    public GarageDoorDownCommand(GarageDoor garagedoor){
        this.garagedoor=garagedoor;
    }
    public void execute()
    {
        garagedoor.down();
    }
    public void undo(){
        garagedoor.up();
    }
} 
