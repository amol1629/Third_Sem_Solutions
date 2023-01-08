package slip6;
public class RemoteControl{
    Command[] onSlot;
    Command[] offSlot;
    Command undoCommand;
    public RemoteControl(){
        onSlot=new Command[7];
        offSlot=new Command[7];
        undoCommand=new NullCommand();
        for(int i=0;i<7;i++)
        {
            onSlot[i]=new NullCommand();
            offSlot[i]=new NullCommand();
        }
    }
    public void setCommand(int slotNo,Command onCommand,Command offCommand)
    {
        onSlot[slotNo]=onCommand;
        offSlot[slotNo]=offCommand;
    }

    public void onButtonPress(int slot)
    {
        onSlot[slot].execute();
        undoCommand=onSlot[slot];
    }

    public void offButtonPress(int slot)
    {
        offSlot[slot].execute();
        undoCommand=offSlot[slot];
    }
    public void undoButtonPress()
    {
        undoCommand.undo();
    }
    
    public String toString(){
        StringBuffer sb=new StringBuffer();
        sb.append("-------------------Remote Control-------------------\n");
        for(int i=0;i<7;++i)
        {
            sb.append("slot["+i+"] "+onSlot[i].getClass().getName()+" | "+offSlot[i].getClass().getName()+"\n");
        }
        sb.append("undo: "+undoCommand.getClass().getName()+"\n");
        return sb.toString();
    }
    
}