import impl.ConcreteObserver1;
import impl.ConcreteObserver2;
import impl.ConcreteObserver3;
import impl.WeatherData;
import inter.Observer;
import inter.Subject;

public class Main {

    public static void main(String[] args) {
        // 主题
        Subject subject  = new WeatherData();

        //对数据有不同需求的观察者
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Observer observer3 = new ConcreteObserver3();

        //注册观察者
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        //测试  主题对象数据发生变化
        ((WeatherData) subject).measurementsChanged(12,55,3000);
    }
}
