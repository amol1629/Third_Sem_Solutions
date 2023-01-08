package slip4;

public class ChicagoStylePizzaStore extends PizzaStore{
    public Pizza createPizza(String type)
    {
        if(type.equals("Cheese"))
        {
            return new ChicagoStyleCheesePizza();
        }
        else if(type.equals("Veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        else
        return null;
    }
}