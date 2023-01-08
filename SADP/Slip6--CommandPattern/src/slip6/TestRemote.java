package slip6;
import java.io.*;
public class TestRemote{
    
    public static void main(String []ar){
        RemoteControl remote=new RemoteControl();
        Light livingRoomLight=new Light("Living Room");
        CeilingFan ceilingFan=new CeilingFan("Living Room");
        GarageDoor garageDoor=new GarageDoor("");
        Stereo stereo =new Stereo("Living Room");

        remote.setCommand(0,new LightOnCommand(livingRoomLight),new LightOffCommand(livingRoomLight));
        remote.setCommand(1,new CeilingFanOnCommand(ceilingFan),new CeilingFanOffCommand(ceilingFan));
        remote.setCommand(2,new GarageDoorUpCommand(garageDoor),new GarageDoorUpCommand(garageDoor));
        remote.setCommand(3,new StereoOnCommand(stereo),new StereoOffCommand(stereo));
        remote.setCommand(4,new CeilingFanHighCommand(ceilingFan),new CeilingFanOffCommand(ceilingFan));
        remote.setCommand(5,new CeilingFanMidCommand(ceilingFan),new CeilingFanOffCommand(ceilingFan));

        System.out.println(remote);

        remote.onButtonPress(5);
        remote.offButtonPress(5);
        System.out.println(remote);
        remote.undoButtonPress();
    }
}