package IteratorPattern;

import java.util.ArrayList;

/**
 * Created by kang on 17/4/24.
 */
public class DinerMenu implements Menu {

    ArrayList<String> arrayList = new ArrayList<>(10);


    public DinerMenu(){
        for (int i=0;i<10;i++) {
            arrayList.add(i + "菜单");
        }
    }

    @Override
    public Iterator createIterator() {

        return new DinerMenuInterator(arrayList);

    }
}
