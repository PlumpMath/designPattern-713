package IteratorPattern;

/**
 * Created by kang on 17/4/24.
 */
public class IteratorTest {


    public static void main(String[] args) {
        //DinerMenu 看做是集合类
        DinerMenu menu = new DinerMenu();
        Iterator iterator = menu.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
