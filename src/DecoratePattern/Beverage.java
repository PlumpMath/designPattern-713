package DecoratePattern;

/**
 * Created by kang on 17/4/21.
 */

/**
 * 抽象基类；beverage：饮料
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
