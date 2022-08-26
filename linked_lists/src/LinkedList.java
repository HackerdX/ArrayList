public class LinkedList {
    public static void main(String[] args) {
        Node head = createNodes(100);
        int getSize = getSizeOfLinkedList(head);
        printNodes(head, getSize);
        System.out.println("Size of Linked List is: "+ getSize);
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
        Node temp = head;
        for(int i = 2; i <= size; i++){
            temp.next = new Node(i);
            temp = temp.next;
        }
        return head;
    }

    private static int getSizeOfLinkedList(Node head){
        if(head == null) return 0;
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
