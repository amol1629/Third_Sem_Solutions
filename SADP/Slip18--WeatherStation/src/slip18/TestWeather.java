package slip18;
public class TestWeather{
    public static void main(String[] arg)
    {
        WeatherData w=new WeatherData();
        currentDisplay curr=new currentDisplay(w);

        w.setMeasurements(22.4f,79.0f,1016.0f);
        w.setMeasurements(27.4f,50.0f,2016.0f);
        
    }
}