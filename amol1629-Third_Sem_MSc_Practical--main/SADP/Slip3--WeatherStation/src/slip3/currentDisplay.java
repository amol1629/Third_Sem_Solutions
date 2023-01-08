package slip3;

import java.util.Observer;
import java.util.Observable;

public class currentDisplay implements Observer{
    private Observable weatherData;
    private float temperature;
    private float humidity;

    public currentDisplay(Observable o)
    {
        this.weatherData=o;
        weatherData.addObserver(this);
    }
    public void update(Observable o,Object arg)
    {
        if(o instanceof WeatherData)
        {
            this.temperature=((WeatherData)o).getTemperature();
            this.humidity=((WeatherData)o).getHumidity();
            Display();
        }
    }
    public void Display()
    {
        System.out.println("Temperature :"+temperature+".C Humidity:"+humidity+"%");
    }

}