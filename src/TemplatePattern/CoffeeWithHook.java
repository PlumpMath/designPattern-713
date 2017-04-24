package TemplatePattern;

/**
 * Created by kang on 17/4/23.
 */
public class CoffeeWithHook extends CaffeineBeverge {
    @Override
    void brew() {
        System.out.println("加入咖啡因！");
    }

    @Override
    void addCondiments() {
        System.out.println("加入牛奶！");
    }

    //子类根据需求重写hook方法
    public boolean customWants(){
        return  false;
    }



}
