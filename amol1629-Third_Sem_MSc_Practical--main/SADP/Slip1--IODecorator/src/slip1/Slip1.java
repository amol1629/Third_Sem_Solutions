package slip1;

import java.io.*;
public class Slip1{
    public static void main(String[] args)
    {
        try
        {
            int c;
            InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("a.txt")));
            while((c=in.read())>0)
            System.out.print((char)c);
        }
        catch(IOException io)
        {
            io.printStackTrace();
        }
    }
}
