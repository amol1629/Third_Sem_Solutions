package slip24;
import java.util.Iterator;
public class DinerMenu implements Menu
{
    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;
    public DinerMenu()
    {
        menuItems=new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","(Fakin) Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day with side of potato salad",true,2.99);
        addItem("Hotdog","A hotdog with saurkraut ,relish, onion topped with cheese",false,3.05);
    }
    public void addItem(String name,String description,boolean vegeterian,double price)
    {
        if(numberOfItems>=MAX_ITEMS)
        System.err.println("Sorry, menu is full! Can't add item to menu");
        else{
            menuItems[numberOfItems]=new MenuItem(name,description,vegeterian,price);
            numberOfItems++;
        }
    }
    public Iterator<MenuItem> createIterator()
    {
        return new DinerMenuIterator(menuItems);
    }
}
