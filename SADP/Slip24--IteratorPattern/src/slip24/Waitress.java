package slip24;
import java.util.*;
public class Waitress{
    
    public void printMenu()
    {
        Menu pancakeHouseMenu=new PancakeHouseMenu();
        Menu dinerMenu=new DinerMenu();
        Menu cafeMenu=new CafeMenu();

        System.out.println("---------BreakFast Menu-----");
        printMenu(pancakeHouseMenu.createIterator());
        
        System.out.println("---------Lunch Menu---------");
        printMenu(dinerMenu.createIterator());

        System.out.println("---------Dinner Menu---------");
        printMenu(cafeMenu.createIterator());

    }
    public void printMenu(Iterator<MenuItem> menuIterator)
    {
        while(menuIterator.hasNext())
        {
            MenuItem m=(MenuItem)menuIterator.next();
            System.out.println(m.getName()+", "+m.getPrice()+" -- "+m.getDescription());
        }
    }

}