public class DeQue {
    static Node head = null;
    static Node tail = null;
    public static void main(String[] args) {
        push_front(5);
        push_front(7);
        push_front(2);
        push_back(3);
        push_back(8);
        push_back(4);
        push_back(9);
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println();

        pop_front();
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println();

        pop_back();
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println();

        pop_front();
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println();

        pop_back();
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println();

        pop_front();
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println();

        pop_back();
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println();

        pop_front();
        System.out.println("size of Deque: "+size());
        printDequeFront();
//        printDequeBack();
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println("front of Deque: "+front());
        System.out.println("back of Deque: "+back());

        System.out.println("size of Deque: "+size());
        System.out.println("isEmpty Deque: "+ empty());
        System.out.println("front of Deque: "+front()); /* display error Deque is Empty */
        System.out.println("back of Deque: "+back());
    }

    static void push_front(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            tail = newnode;
        } else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        head.incrementSize();
    }

    static void push_back(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            tail = newnode;
        } else{
            tail.next = newnode;
            tail.next.prev = tail;
            tail = tail.next;
        }
        head.incrementSize();
    }

    static void pop_front(){
        try{
            head.decrementSize();
            if(head == tail) {
                head = null;
                tail = null;
            } else {
                head.next.prev = null;
                head = head.next;
            }
        } catch (NullPointerException n){
            throw new RuntimeException("Deque is empty: "+n);
        }
    }

    static void pop_back(){
        try{
            head.decrementSize();
            if(head == tail) {
                head = null;
                tail = null;
            } else {
                tail.prev.next = null;
                tail = tail.prev;
            }
        } catch (NullPointerException n){
            throw new RuntimeException("Deque is empty: "+n);
        }
    }

    static int front() {
        try {
            return head.data;
        } catch (NullPointerException n){
            throw new RuntimeException("Deque is Empty "+ n);
        }
    }

    static int back() {
        try {
            return tail.data;
        } catch (NullPointerException n){
            throw new RuntimeException("Deque is Empty "+ n);
        }
    }

    static boolean empty(){
        return head == null || head.size() == 0;
    }

    static void printDequeFront(){
        Node temp = head;
        System.out.print("front -> ");
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            System.out.print(" -> ");
        }
        System.out.print("NULL");
        System.out.println();
    }

//    static void printDequeBack(){
//        Node temp = tail;
//        System.out.print("tail -> ");
//        while(temp != null){
//            System.out.print(temp.data);
//            temp = temp.prev;
//            System.out.print(" -> ");
//        }
//        System.out.print("NULL");
//        System.out.println();
//    }

    static int size(){
        if (head == null) return 0;
        return head.size();
    }
}
