package slip7;
import java.io.*;
public class Stereo{
    String location;
    public Stereo(String loc){
        location=loc;
    }
    public void on(){
        System.out.println(location+"Stereo ON");
    }
    public void off(){
        System.out.println(location+"Stereo OFF");
    }
    public void setCD(){
        System.out.println("CD is set");
    }
}

