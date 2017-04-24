package ProxyPattern.DynamicProxyPattern;

/**
 * Created by kang on 17/4/24.
 */
public class Car implements Moveable {

    @Override
    public void move() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("汽车在行驶中！");
    }
}
