package SinglePattern;

/**
 * Created by kang on 17/4/21.
 */

/**
 * 双重检查锁定 加上volatile关键字，禁止new SingletonTest4()时的重排序.
 */
public class SingletonTest4 {

    private SingletonTest4(){

    }
    private static volatile SingletonTest4 singletonTest4;

    public static SingletonTest4 getInstance(){

        if (singletonTest4 ==null){

            synchronized (SingletonTest4.class){
                if (singletonTest4 ==null){

                    singletonTest4 = new SingletonTest4();
                }
            }
        }

        return singletonTest4;
    }

}
