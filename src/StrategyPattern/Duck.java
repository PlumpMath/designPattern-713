package StrategyPattern;

/**
 * Created by kang on 17/4/21.
 */
public abstract class Duck {

    //用组合的形式
    public FlyBehavior flyBehavior;
    public QuakeBehavior quakeBehavior;

    public void fly(){
        flyBehavior.fly();
    }
    public void quake(){
        quakeBehavior.quake();
    }


    public void swim(){
        System.out.println("我会游泳!");
    }

    public abstract void dispaly();



}
