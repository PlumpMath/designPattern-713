package FactoryPattern1;

/**
 * Created by kang on 17/4/23.
 */
public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore coStore = new ChicagoPizzaStore();

        Pizza p1=nyStore.orderPizza("Cheese");
        Pizza p2= nyStore.orderPizza("clam");
        Pizza p3= coStore.orderPizza("Cheese");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
