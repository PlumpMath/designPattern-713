package AdapterPattern;

/**
 * Created by kang on 17/4/23.
 */
public class Adapter implements Duck {

    Turkey turkey;

    public Adapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quake() {
        turkey.goble();
    }
}
