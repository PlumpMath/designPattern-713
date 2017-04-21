package ObserverPattern;

import java.util.ArrayList;

/**
 * Created by kang on 17/4/21.
 */
public class WeatherData implements Subject {

    //用于存储注册的观察者对象
    private ArrayList<Observer> arrayList;
    //主题类拥有的数据，要传递给观察者类的数据
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        arrayList = new ArrayList<>();
    }

    @Override
    public void registerObject(Observer observer) {
        if (observer !=null){
            arrayList.add(observer);
        }
    }

    @Override
    public void removeObject(Observer observer) {
        int i=0;
        if ((i=arrayList.indexOf(observer))<arrayList.size()){
            arrayList.remove(i);
        }

    }

    @Override
    public void notifyObject() {
        for (Observer observer :arrayList){
            observer.update(temperature,humidity,pressure);
        }

    }


    public void measurementsChanged(){

        notifyObject();

    }
    //设置主题类的数据
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }


}
