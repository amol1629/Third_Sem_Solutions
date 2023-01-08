package slip6;
import java.io.*;
public class GarageDoor{
    String location;
    public GarageDoor(String loc){
        location=loc;
    }
    public void up(){
        System.out.println(location+"GarageDoor up");
    }
    public void down(){
        System.out.println(location+"GarageDoor down");
    }
}

