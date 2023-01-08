package slip24;
import java.util.*;
public class CafeMenu implements Menu
{
    HashMap<String,MenuItem> menuItems= new HashMap<String,MenuItem>();

    public CafeMenu(){
        addItem("Veggie Burger and Air Force","Veggie Burger on a whole wheat bun,lettuce,tomato and fries",true,3.99);
        addItem("Soup if the day","A cup of soup of the day with salad",false,3.69);
        addItem("Burrito","A large burrito , with whole pinto beans ,salsa ,guacamole",true,4.29);

    }
    public void addItem(String name,String description,boolean vegetarian,double price)
    {
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }
    public Iterator<MenuItem> createIterator()
    {
        return menuItems.values().iterator();
    }
}
