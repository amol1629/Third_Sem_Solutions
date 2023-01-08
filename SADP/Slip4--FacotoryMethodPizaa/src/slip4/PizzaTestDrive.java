package slip4;

import java.io.*;
import java.util.*;
public class PizzaTestDrive{
    public static void main(String []ar)
    {
        PizzaStore store=new NYStylePizzaStore();
        store.orderPizza("Cheese");
        store=new ChicagoStylePizzaStore();
        store.orderPizza("Veggie");
    }
}