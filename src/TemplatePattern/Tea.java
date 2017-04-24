package TemplatePattern;

/**
 * Created by kang on 17/4/23.
 */
public class Tea extends CaffeineBeverge {
    @Override
    void brew() {
        System.out.println("加入茶叶！");
    }

    @Override
    void addCondiments() {
        System.out.println("加入柠檬！");
    }
}
