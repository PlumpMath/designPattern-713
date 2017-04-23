package StrategyPattern;

/**
 * Created by kang on 17/4/21.
 */
public class Quake implements QuakeBehavior {
    @Override
    public void quake() {
        System.out.println("鸭子会嘎嘎嘎地叫！");
    }
}
