package StrategyPattern;

/**
 * Created by kang on 17/4/21.
 */
public class FlyWithWinds implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会飞！");
    }
}
