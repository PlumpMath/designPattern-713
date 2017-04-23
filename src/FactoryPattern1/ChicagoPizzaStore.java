package FactoryPattern1;

/**
 * Created by kang on 17/4/23.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if (type.equals("Cheese")){
            return new ChicagoCheesePizza();
        }

        return null;
    }
}
