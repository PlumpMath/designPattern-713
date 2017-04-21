package ObserverPattern;

/**
 * Created by kang on 17/4/21.
 */
public class Test {


    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(subject);
        subject.setMeasurements(10,9,8);
        //currentConditionDisplay.display();
    }
}
