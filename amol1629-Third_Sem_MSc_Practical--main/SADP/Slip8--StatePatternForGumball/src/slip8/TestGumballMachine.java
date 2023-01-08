package slip8;
import java.io.*;

public class TestGumballMachine
{
    public static void main(String[] arg) throws IOException
    {
        GumballMachine g1=new GumballMachine(5);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.print("Menu\n1.InsertQuarter\n2.TurnCrank\n3.EjectQuarter\n4.Show Machine State\nEnter Choice :");
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:g1.insertQuarter();break;
                case 2:g1.turnCrank();break;
                case 3:g1.ejectQuarter();break;
                case 4:System.out.println(g1);
            }
        }
        
    }
}
