package org.noip;

public class Node<T> {

    private T item;
    private Node<T> nextNode;

    public boolean hasNext(){
        return this.nextNode != null;
    }

    public Node(){}

    public Node(T item){
        this.item = item;
    }

    public Node<T> next(){
        return this.nextNode;
    }

    public void setNext(Node<T> node){
        this.nextNode = node;
    }

    public T getItem(){
        return this.item;
    }

    public void setItem(T item){
        this.item = item;
    }
}
