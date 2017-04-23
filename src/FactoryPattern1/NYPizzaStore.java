package FactoryPattern1;

/**
 * Created by kang on 17/4/23.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if (type.equals("Cheese")){
            return new NYCheesePizza();
        }else if (type.equals("clam")){
            return new NYclamPizza();
        }

        return null;
    }
}
