package Algorithym_And_Structure.BracketCheker.LinkdedStack;

public interface StackADT<T> {
    public void push(T item);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
    public  String toString();
}
