package ProxyPattern;

/**
 * Created by kang on 17/4/24.
 */

/**
 * 调用代理的方法也就是调用被代理类的方法
 */
public class Proxy implements Subject {

    Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {

        System.out.println("代理开始！");
        subject.request();
        System.out.println("代理结束！");

    }
}
