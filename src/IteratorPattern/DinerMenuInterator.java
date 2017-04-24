package IteratorPattern;

import java.util.ArrayList;

/**
 * Created by kang on 17/4/24.
 */

/**
 * 迭代器是拥有数据的！
 */
public class DinerMenuInterator implements Iterator {

    ArrayList<String> arrayList ;
    int index=0;

    public DinerMenuInterator(ArrayList<String> arrayList){
        this.arrayList = arrayList;
    }


    @Override
    public boolean hasNext() {

        if (index<arrayList.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return arrayList.get(index++);
    }
}
