package Constructor;

/**
 * Created by kang on 17/4/25.
 */
public class Super {

    int i=1;

    static {
        System.out.println("父类静态代码块！");
    }
    public Super(){
        System.out.println("父类构造器"+this.i);

    }
    {
        System.out.println("父类非静态代码块！"+i);
    }

}
