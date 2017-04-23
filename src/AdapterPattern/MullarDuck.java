package AdapterPattern;

/**
 * Created by kang on 17/4/23.
 */
public class MullarDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("MullarDuck.fly!");
    }

    @Override
    public void quake() {
        System.out.println("MullarDuck.quake!");
    }
}
