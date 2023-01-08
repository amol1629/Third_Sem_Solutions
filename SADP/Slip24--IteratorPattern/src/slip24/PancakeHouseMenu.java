package slip24;
import java.util.*;
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu()
    {
        menuItems=new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast",false,2.99);
        addItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage",false,2.99);
        addItem("Blueberry Panacake","Pancakes made with fresh blueberries, and blueberry syrup",true,3.49);
        addItem("Waffles","Waffles, with your choice of blueberries or strawberries",true,3.59);
    }
    public void addItem(String name,String description,boolean vegeterian,double price)
    {
        menuItems.add(new MenuItem(name,description,vegeterian,price));
    }

    public Iterator<MenuItem> createIterator()
    {
        return menuItems.iterator();
    }
}