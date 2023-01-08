package slip6;
import java.io.*;

public class CeilingFan{
    public static final int HIGH=3;
    public static final int MID=2;
    public static final int LOW=1;
    public static final int OFF=0;
    String location;
    int speed;

    public CeilingFan(String loc){
        location=loc;
    }
    public void on(){
        System.out.println(location+" CeilingFan ON");
    }
    public void off(){
        System.out.println(location+" CeilingFan OFF");
        speed=OFF;
    }
    public void high()
    {
        System.out.println(location+" CeilingFan HIGH");
        speed=HIGH;
    }
    public void mid()
    {
        System.out.println(location+" CeilingFan MID");
        speed=MID;
    }
    public void low()
    {
        System.out.println(location+" CeilingFan LOW");
        speed=LOW;
    }
    public int getSpeed()
    {
        return speed;
    }
}

