package org.noip.konst.collections;

import org.noip.Node;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private Node<T> first;
    private int size;

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return this.size;
    }

    public void push(T item){
        Node<T> oldFirst = first;

        first = new Node<>(item);
        first.setNext(oldFirst);

        size++;
    }

    public T pop(){
        T retVal = first.getItem();

        first = first.next();

        size--;

        return retVal;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
