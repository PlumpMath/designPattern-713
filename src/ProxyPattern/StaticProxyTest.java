package ProxyPattern;

/**
 * Created by kang on 17/4/24.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxySubject = new Proxy(realSubject);
        proxySubject.request();
    }
}
