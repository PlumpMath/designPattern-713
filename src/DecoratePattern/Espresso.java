package DecoratePattern;

/**
 * Created by kang on 17/4/21.
 */

/**
 * 具体饮料类型，装饰者层次的最里层！
 */
public class Espresso extends  Beverage {

    public Espresso(){
        description="Espresso";
    }

    @Override
    public double cost() {
        return 0;
    }
}
