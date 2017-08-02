package org.noip.konst.collections;

import org.noip.Node;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{

    Node<T> first;
    Node<T> last;
    int size;


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(T item){
        Node<T> newNode = new Node<>(item);

        if(first == null){
            first = newNode;
        }

        if(last == null){
            last = newNode;
        } else {
            last.setNext(newNode);
            last = last.next();
        }

        size++;
    }

    public T dequeue(){
        T retVal = first.getItem();
        first = first.next();
        if(first == null){
            last = null;
        }

        size--;

        return retVal;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
