package TemplatePattern;

/**
 * Created by kang on 17/4/23.
 */
public abstract class CaffeineBeverge {
    //模板方法
    final   void  prepare(){
        boilWater();
        brew();
        pourInCup();
        //钩子方法
        if (customWants()){
            addCondiments();
        }

    }

    abstract void brew();
    abstract void addCondiments();

    public void boilWater(){
        System.out.println("烧开水！");
    }
    public void pourInCup(){
        System.out.println("把水倒入杯中！");
    }

    public boolean customWants(){
        return true;
    }

}
