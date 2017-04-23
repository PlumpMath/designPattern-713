package StrategyPattern;

/**
 * Created by kang on 17/4/21.
 */
public class Squake implements QuakeBehavior {
    @Override
    public void quake() {
        System.out.println("鸭子会吱吱吱地叫！");
    }
}
