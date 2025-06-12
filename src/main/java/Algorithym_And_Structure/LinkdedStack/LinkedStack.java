package Algorithym_And_Structure.LinkdedStack;

import Algorithym_And_Structure.LinkdedStack.StackADT;

import java.util.EmptyStackException;

public class LinkedStack<T> implements StackADT<T> {

    private int count;

    private LinkedNode<T> top;

    public LinkedStack(){
        count = 0;
        top = null;
    }


    @Override
    public void push(T item) {
        LinkedNode<T> temp = new LinkedNode<>(item, top);
        top = temp;
        count++;
    }



    @Override
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = top.getData();
        top = top.getNext();
        count--;
        return result;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
         return  top.getData();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
}
