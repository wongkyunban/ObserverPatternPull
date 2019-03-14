package impl;

import inter.Observer;
import inter.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    //提供出观察者拉取数据的方法
    public float getTemp() {
        return temp;
    }
    //提供出观察者拉取数据的方法
    public float getHumidity() {
        return humidity;
    }

    //提供出观察者拉取数据的方法
    public float getPressure() {
        return pressure;
    }

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Subject subject) {
        for(Observer o:observers){
            o.onDataChanged(subject);
        }
    }

    public void measurementsChanged(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(this);
    }

}
