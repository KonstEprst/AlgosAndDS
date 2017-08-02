package org.noip.konst.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Iterable<T> {

    private List<T> items = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean add(T item) {
        return items.add(item);
    }

}
