package SinglePattern;

/**
 * Created by kang on 17/4/20.
 */

/**
 * 饱汉式，效率高，线程不安全
 */
public class SingletonTest2 {

    private SingletonTest2(){

    }

    private static SingletonTest2 singletonTest2;

    public static SingletonTest2 getInstance(){

        if (singletonTest2==null){
            singletonTest2 = new SingletonTest2();
        }

        return singletonTest2;
    }


}
