package Algorithym_And_Structure.Stack;

public class ArrayStack <T> implements StackADT<T>{
    private int top;

    private T[] stack;

    private final int DEFAULT_CAPACITY = 100;

    public ArrayStack(){
        top = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack(int initialCAPACITY){
        top = 0;
        stack = (T[])(new Object[initialCAPACITY]);
    }

    @Override
    public void push(T item) {
        if(size() == stack.length){
            expandCapacity(); // mở rộng kích thước của mảng
        }

        stack[top] = item;
        top++;
    }

    private void expandCapacity() {
        T[] newStack = (T[])(new Object[stack.length * 2]);

        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw  new RuntimeException("Mảng stack bị rỗng");
        }
        top--;
        T rs = stack[top];
        stack[top] = null;
        return rs;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw  new RuntimeException("Mảng stack bị rỗng");
        }
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.top;
    }
}
