package slip3;

import java.util.Observable;
import java.util.Observer;
import java.util.Collection.*;

public class WeatherData extends Observable{
    
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature()
    {
        return temperature;
    }
    public float getHumidity()
    {
        return humidity;
    }
    public float getPressure()
    {
        return pressure;
    }

    public void measurementChanged()
    {
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float t,float h,float p)
    {
        temperature=t;humidity=h;pressure=p;
        measurementChanged();
    }

}