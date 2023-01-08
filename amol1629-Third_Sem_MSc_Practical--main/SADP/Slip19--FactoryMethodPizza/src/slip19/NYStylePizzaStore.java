package slip19;

public class NYStylePizzaStore extends PizzaStore{
    public Pizza createPizza(String type)
    {
        if(type.equals("Cheese"))
        {
            return new NYStyleCheesePizza();
        }
        else if(type.equals("Veggie")){
            return new NYStyleVeggiePizza();
        }
        else
        return null;
    }
}
