package SinglePattern;

/**
 * Created by kang on 17/4/20.
 */

/**
 * 饿汉式，线程安全，但是效率较低
 */
public class SingletonTest {
    //私有化构造器
    private SingletonTest(){

    }

    private static final SingletonTest instance = new SingletonTest();

    public static SingletonTest getInstance(){
        return instance;
    }



}
