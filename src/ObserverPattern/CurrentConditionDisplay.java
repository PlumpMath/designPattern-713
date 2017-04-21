package ObserverPattern;

/**
 * Created by kang on 17/4/21.
 */

/**
 * 观察者类，需要在主题类中注册观察者类。
 */
public class CurrentConditionDisplay implements Observer,Dispalyment {

    float temp,humidity,pressure;
    public WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        //在主题类中注册观察者类。
        this.weatherData = weatherData;
        weatherData.registerObject(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature: "+temp+"  humidity:  "+humidity+"  pressure: "+pressure);
    }
}
