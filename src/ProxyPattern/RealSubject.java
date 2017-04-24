package ProxyPattern;

/**
 * Created by kang on 17/4/24.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject.request()!");
    }
}
