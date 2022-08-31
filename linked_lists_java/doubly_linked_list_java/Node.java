public class Node {
    int data;
    Node next;
    Node prev;

    private static int size;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    void incrementSize(){
        size++;
    }

    void decrementSize(){
        if(size <= 0) size = 0;
        size--;
    }

    int size(){
        return size;
    }
}
