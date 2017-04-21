package SinglePattern;

/**
 * Created by kang on 17/4/20.
 */

/**
 * 饱汉式，线程安全，但是synchronized关键字导致效率低
 */
public class SingletonTest3 {

    private SingletonTest3(){

    }

    private static SingletonTest3 singletonTest3;

    public static synchronized SingletonTest3 getInstance(){
        if (singletonTest3==null){
            singletonTest3 = new SingletonTest3();
        }
        return singletonTest3;
    }

}
