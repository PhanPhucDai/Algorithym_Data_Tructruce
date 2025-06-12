package Algorithym_And_Structure.Linkedlist;

public class Node<T> {
    private T data;
    private Node<T> node;

    public Node() {
    }

    public Node(T data, Node<T> node) {
        this.data = data;
        this.node = node;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
}
