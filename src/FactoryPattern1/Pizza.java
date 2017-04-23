package FactoryPattern1;

/**
 * Created by kang on 17/4/23.
 */
public abstract class Pizza {

    String name;
    String tough;
    String sauce;

    void prepare(){
        System.out.println("Preparing!"+name);
    }
    void bake(){
        System.out.println("bake!");
    }
    void cut(){
        System.out.println("cut!");
    }
    void box(){
        System.out.println("box!");
    }

    public String getName(){
        return name;
    }

}
