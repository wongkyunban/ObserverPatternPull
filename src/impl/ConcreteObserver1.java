package impl;

import inter.Observer;
import inter.Subject;

public class ConcreteObserver1 implements Observer {


    @Override
    public void onDataChanged(Subject subject) {
        String msg = "ConcreteObserver1:temperature "+ ((WeatherData)subject).getTemp() ;
        System.out.println(msg);
    }
}
