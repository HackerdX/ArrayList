public class Node {
    int data;
    Node next;
    static int size;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    void incrementSize(){
        this.size++;
    }
    void decrementSize(){
        if(size <= 0) size = 0;
        else this.size--;
    }
    protected int size(){
        return size;
    }
}
