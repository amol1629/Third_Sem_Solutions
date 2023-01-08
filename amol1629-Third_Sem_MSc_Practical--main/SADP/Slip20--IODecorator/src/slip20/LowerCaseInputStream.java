package slip20;
import java.io.*;

public class LowerCaseInputStream extends FilterInputStream{
    public LowerCaseInputStream(InputStream in)
    {
        super(in);
    }

    public int read() throws IOException
    {
        int c=in.read();
        return (c==-1?-1:Character.toLowerCase((char)c));
    }

    public int read(byte[] b,int off,int len) throws IOException
    {
        int length=in.read(b,off,len);
        for(int i=off;i<len;++i)
        {
            b[i]=(b[i]>=65 && b[i]<=90)?(byte)(b[i]+32):b[i];
        }
        return length;
    }
}