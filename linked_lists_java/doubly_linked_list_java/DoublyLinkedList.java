public class DoublyLinkedList {
    public static void main(String[] args) {
        Node head = createNodes(10);
        printNodes(head, head.size());
        System.out.println("Size of Linked List is: "+ head.size());
        head = insertNode(head, 11, 120);
        printNodes(head, head.size());
        System.out.println("Size of Linked List is: "+ head.size());
        head = deleteNode(head, 12);
        printNodes(head, head.size());
        System.out.println("Size of Linked List is: "+ head.size());
    }

    private static Node insertNode(Node head, int position, int value){
        if(head == null) return null;
        if(position > head.size()) position = head.size() + 1;
        Node newNode = new Node(value);
        head.incrementSize();
        if(position == 0) {
            head.prev = newNode;
            newNode.next = head;
            return newNode;
        } else{
            int loop = position - 2;
            Node temp = head;
            while (loop-- > 0){
                temp = temp.next;
            }
            if(temp.next == null){
                newNode.next = null;
            } else {
                newNode.next = temp.next;
                temp.next.prev = newNode;
            }
            newNode.prev = temp;
            temp.next = newNode;
            return head;
        }
    }

    private static Node deleteNode(Node head, int position) {
        if (head == null) return null;
        if (position >= head.size()) position = head.size() - 1;
        head.decrementSize();
        if (position == 0) {
            head.next.prev = null;
            return head.next;
        } else {
            int loop = position - 1;
            Node temp = head;
            while (loop-- >= 0) {
                temp = temp.next;
            }
            if(temp.next != null){
                temp.next.prev = temp.prev;
            }
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            return head;
        }
    }

    private static void printNodes(Node head, int getSize) {
        Node temp;
        temp = head;
        System.out.print("HEAD -> ");
        for(int i = 0; i < getSize; i++) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    private static Node createNodes(int size) {
        if(size == 0) return null;
        Node head = new Node(1);
        head.incrementSize();
        Node temp = head;
        for(int i = 2; i <= size; i++){
            Node newNode = new Node(i);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
            head.incrementSize();
        }
        return head;
    }
}
