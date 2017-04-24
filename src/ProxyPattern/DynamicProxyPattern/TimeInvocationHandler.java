package ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kang on 17/4/24.
 */

/**
 * 事务处理器
 */
public class TimeInvocationHandler implements InvocationHandler {

    private Moveable moveable;

    public TimeInvocationHandler(Moveable moveable){
        this.moveable = moveable;
    }


    /**
     * @param proxy 代理类
     * @param method  代理类中被调用的方法名
     * @param args    代理类中被调用的方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long startTime=System.currentTimeMillis();
        moveable.move();
        long endTime=System.currentTimeMillis();
        System.out.println("汽车行驶时间为："+(endTime-startTime));
        return null;
    }
}
