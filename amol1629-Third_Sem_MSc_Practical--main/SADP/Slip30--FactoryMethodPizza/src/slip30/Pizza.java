package slip30;
import java.io.*;
import java.util.*;
public abstract class Pizza{
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings=new ArrayList<>();
    public void prepare()
    {
        System.out.println("---------------Preparing "+name+" -------------------");
        System.out.println("Tossing "+dough+" .....");
        System.out.println("Adding "+sauce+" ....");
        System.out.print("Adding toppings: ");
        for(String topping:toppings)
        {
            System.out.print(topping+",");
        }
        System.out.println("");
    }

    public void bake()
    {
        System.out.println("Baking for 25 minutes...");
    }
    public void cut()
    {
        System.out.println("Cutting 6 slices...");
    }
    public void box()
    {
        System.out.println("Boxing in company box..");
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}