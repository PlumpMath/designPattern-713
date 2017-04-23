package FactoryPattern1;

/**
 * Created by kang on 17/4/23.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.box();
        pizza.bake();
        pizza.cut();

        return pizza;
    }

    //留给子类来实例化对象
    abstract Pizza createPizza(String type);
}
