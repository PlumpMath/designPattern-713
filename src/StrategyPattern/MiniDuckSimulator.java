package StrategyPattern;

/**
 * Created by kang on 17/4/21.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quake();
    }
}
