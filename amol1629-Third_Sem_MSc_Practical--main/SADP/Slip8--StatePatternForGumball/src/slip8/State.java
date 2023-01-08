package slip8;
import java.io.*;
public interface State
{
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}

