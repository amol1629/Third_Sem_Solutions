package slip7;
import java.io.*;
public class Light{
    String location;
    Light(String loc){
        location=loc;
    }
    public void on(){
        System.out.println(location+"Light ON");
    }
    public void off(){
        System.out.println(location+"Light OFF");
    }
}