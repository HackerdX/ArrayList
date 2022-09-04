public class Queue {
    static Node head = null;
    static Node tail = null;
    public static void main(String[] args) {
        push(5);
        push(7);
        push(2);
        push(3);
        push(8);
        push(4);
        push(9);
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println();

        pop();
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println();

        pop();
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println();

        pop();
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println();

        pop();
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println();

        pop();
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println();

        pop();
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println();

        pop();
        System.out.println("size of queue: "+size());
        printqueue();
        System.out.println("isEmpty queue: "+ empty());
        System.out.println("front of queue: "+front());
        System.out.println("back of queue: "+back());

        System.out.println("size of queue: "+size());
        System.out.println("isEmpty queue: "+ empty());
        System.out.println("front of queue: "+front()); /* display error Queue is Empty */
        System.out.println("back of queue: "+back());
    }
    static void push(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            tail = newnode;
        } else{
            tail.next = newnode;
            tail = tail.next;
        }
        head.incrementSize();
    }

    static void pop(){
        try{
            head.decrementSize();
            if(head == tail) {
                head = null;
            } else {
                head = head.next;
            }
        } catch (NullPointerException n){
            throw new RuntimeException("Queue is empty: "+n);
        }
    }

    static int front() {
        try {
            return head.data;
        } catch (NullPointerException n){
            throw new RuntimeException("Queue is Empty "+ n);
        }
    }

    static int back() {
        try {
            return tail.data;
        } catch (NullPointerException n){
            throw new RuntimeException("Queue is Empty "+ n);
        }
    }

    static boolean empty(){
        return head == null || head.size() == 0;
    }

    static void printqueue(){
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

    static int size(){
        if (head == null) return 0;
        return head.size();
    }
}
