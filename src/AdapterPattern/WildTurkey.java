package AdapterPattern;

/**
 * Created by kang on 17/4/23.
 */
public class WildTurkey implements Turkey {

    @Override
    public void goble() {
        System.out.println("WildTurkey.goble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey.fly");
    }
}
