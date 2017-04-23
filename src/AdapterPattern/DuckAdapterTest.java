package AdapterPattern;

/**
 * Created by kang on 17/4/23.
 */
public class DuckAdapterTest {


    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Adapter adapter = new Adapter(turkey);

        adapter.fly();
        adapter.quake();
    }
}
