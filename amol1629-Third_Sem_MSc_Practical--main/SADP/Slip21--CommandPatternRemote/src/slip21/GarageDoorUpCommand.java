package slip21;
public class GarageDoorUpCommand implements Command{
    GarageDoor garagedoor;

    public GarageDoorUpCommand(GarageDoor garagedoor){
        this.garagedoor=garagedoor;
    }
    public void execute()
    {
        garagedoor.up();
    }
    public void undo(){
        garagedoor.down();
    } 
} 
