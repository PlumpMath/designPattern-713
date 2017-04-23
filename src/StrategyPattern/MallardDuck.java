package StrategyPattern;

/**
 * Created by kang on 17/4/21.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWinds();
        quakeBehavior = new Quake();
    }

    @Override
    public void dispaly() {
        System.out.println("我是鸭子中的绿头鸭");
    }
}
