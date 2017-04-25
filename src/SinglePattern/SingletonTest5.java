package SinglePattern;

/**
 * Created by kang on 17/4/25.
 */

/**
 * 静态内部类的线程安全延迟加载
 */
public class SingletonTest5 {

    private SingletonTest5(){

    }
    //只有第一次被调用才会类加载
    private static class InstanceHolder{
        private static SingletonTest5 singletonTest5 = new SingletonTest5();
    }

    public static SingletonTest5 getInstance(){
        return InstanceHolder.singletonTest5;
    }
}
