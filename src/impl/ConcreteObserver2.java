package impl;

import inter.Observer;
import inter.Subject;

public class ConcreteObserver2 implements Observer {


    @Override
    public void onDataChanged(Subject subject) {
        String msg = "ConcreteObserver2:humidity "+ ((WeatherData)subject).getHumidity() ;
        System.out.println(msg);
    }
}
