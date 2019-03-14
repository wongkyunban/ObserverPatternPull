package impl;

import inter.Observer;
import inter.Subject;

public class ConcreteObserver3 implements Observer {


    @Override
    public void onDataChanged(Subject subject) {
        String msg = "ConcreteObserver1:pressure "+ ((WeatherData)subject).getPressure() ;
        System.out.println(msg);
    }
}
