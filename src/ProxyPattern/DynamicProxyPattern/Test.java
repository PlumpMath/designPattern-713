package ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.Proxy;

/**
 * Created by kang on 17/4/24.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Car car = new Car();
        TimeInvocationHandler timeInvocationHandler = new TimeInvocationHandler(car);
        Class<?> cl = car.getClass();
        /**
         *loader 类加载器
         *interfaces 实现接口
         *h InvocationHandler
         */
        Moveable moveable = (Moveable) Proxy.newProxyInstance(cl.getClassLoader(),cl.getInterfaces(),timeInvocationHandler);

        moveable.move();
    }


}
