package TemplatePattern;

/**
 * Created by kang on 17/4/23.
 */
public class Coffee extends CaffeineBeverge {
    @Override
    void brew() {
        System.out.println("加入咖啡因！");
    }

    @Override
    void addCondiments() {
        System.out.println("加入牛奶！");
    }
}
