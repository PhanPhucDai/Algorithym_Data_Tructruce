package Algorithym_And_Structure.StudentProject;



public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void traversal(){
        Node<T> tmp = this.head;
        while(tmp != null){
            System.out.println(tmp.toString());
            tmp = tmp.getNext();
            if(tmp == null){
                break;
            }
        }
    }

    public void addFirst(T item){
         Node<T> tNode = new Node<>(item, this.head);
         this.head = tNode;
    }

    public void addLast(T item){
        if(item == null){
            throw new RuntimeException("Can't add item in last so it is null");
        }
        Node<T> tNode = new Node<>(item, null);
        if(head == null){
            head = tNode;
            return ;
        }

        Node<T> tmp = head;
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
        }

        tmp.setNext(tNode);
    }

    public void addItemByKey(T key, T toInsert){
        if(key == null){
            throw new RuntimeException("Can't add item in last so it is null");
        }
        Node<T> tmp = head;

        while(tmp != null && !tmp.getData().equals(key)){
            tmp = tmp.getNext();
        }
        Node<T> node = tmp.getNext();
        Node<T> newNode = new Node<>(toInsert, node);
        tmp.setNext(newNode);
    }

    public void deleteItemByKey(T key){

        if(head != null && head.getData().equals(key)){
            head = head.getNext(); // Xóa head
            return;
        }
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null && !current.getData().equals(key)) {
            prev = current;
            current = current.getNext();
        }
        if (current == null) {
            throw new RuntimeException("Key not found in the list");
        }

        // Bỏ qua node cần xóa
        prev.setNext(current.getNext());
    }

    public int size(T key){
        int count = 0;
        Node<T> tmp = this.head;
        while(tmp != null){
            tmp = tmp.getNext();
            count++;
        }
        return count;
    }

    public boolean findItem(T key){
        Node<T> tmp = this.head;
        while(tmp != null){
            if(tmp.getData().equals(key)){
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
