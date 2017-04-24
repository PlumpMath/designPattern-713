package IteratorPattern;

import java.util.Iterator;

/**
 * Created by kang on 17/4/24.
 */
public class IteratorClass implements Iterable<String> {

    String[] strings ="We are the ONE!".split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int i;
            @Override
            public boolean hasNext() {

                if (i<strings.length||strings[i]!=null){
                    return true;
                }

                return false;
            }

            @Override
            public String next() {


                return strings[i++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }


    public static void main(String[] args) {

        IteratorClass iteratorClass = new IteratorClass();
        for (String s:iteratorClass.strings){
            System.out.println(s);
        }
    }
}
