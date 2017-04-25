package Constructor;

/**
 * Created by kang on 17/4/25.
 */
public class Sub extends Super{

    int j=2;
    static {
        System.out.println("子类静态代码块！");
    }
    public Sub(){
        System.out.println("子类构造器"+i);
    }
    {
        System.out.println("子类非静态代码块！"+i);
    }

    public static void main(String[] args) {
        Super s = new Sub();
    }

}
