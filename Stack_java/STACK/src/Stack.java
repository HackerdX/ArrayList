public class Stack {
    static Node head = null;
    public static void main(String[] args) {
        push(5);
        push(7);
        push(2);
        push(3);
        push(8);
        push(4);
        push(9);
        System.out.println("top of stack: "+top());
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println();

        pop();
        System.out.println("top of stack: "+top());
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println();

        pop();
        System.out.println("top of stack: "+top());
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println();

        pop();
        System.out.println("top of stack: "+top());
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println();

        pop();
        System.out.println("top of stack: "+top());
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println();

        pop();
        System.out.println("top of stack: "+top());
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println();

        pop();
        System.out.println("top of stack: "+top());
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println();

        pop();
        System.out.println("size of stack: "+size());
        printStack();
        System.out.println("isEmpty stack: "+ empty());
        System.out.println("top of stack: "+top());

        pop(); /* This will display error */
    }
    static void push(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        head.incrementSize();
    }

    static void pop(){
        try {
            head.decrementSize();
            head = head.next;
        } catch (NullPointerException n){
            System.out.println("Stack is empty"+ n);
        }
    }

    static int top() {
        try {
            return head.data;
        } catch (NullPointerException n){
            throw new RuntimeException("Stack is Empty "+ n);
        }
    }

    static boolean empty(){
        return head == null || head.size() == 0;
    }

    static void printStack(){
        Node temp = head;
        System.out.print("TOP -> ");
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            System.out.print(" -> ");
        }
        System.out.print("NULL");
        System.out.println();
    }

    static int size(){
        try {
            return head.size();
        } catch (NullPointerException n) {
            return 0;
        }
    }
}
