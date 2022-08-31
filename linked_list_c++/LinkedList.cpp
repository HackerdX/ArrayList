#include<bits/stdc++.h>
using namespace std;
class Node{
    public:
        static int linkedListSize;
        int data;
        Node *next;
        Node(int data){
            this->data = data;
            this->next = NULL;
        }
        void incrementSize() {
            linkedListSize++;
        }
        void decrementSize() {
            if(linkedListSize <= 0) linkedListSize = 0;
            linkedListSize--;
        }
        int size(){
            return linkedListSize;
        }
};

int Node::linkedListSize = 0; /* This is important for static variables */

Node* insertNode(Node *head, int position, int value){
    if(head == NULL) return NULL;
    if(position > head->size()) position = head->size() + 1;
    Node* newNode = new Node(value);
    head->incrementSize();
    if(position == 0) {
        newNode->next = head;
        return newNode;
    } else{
        int loop = position - 2;
        Node *temp = head;
        while (loop-- > 0){
            temp = temp->next;
        }
        newNode->next = temp->next;
        temp->next = newNode;
        return head;
    }
}

Node* deleteNode(Node *head, int position){
    if (head == NULL) return NULL;
    if (position >= head->size()) position = head->size() - 1;
    head->decrementSize();
    Node *temp = head;
    if (position == 0) {
        head = head->next;
        free(temp);
        return head;
    } else {
        int loop = position - 1;
        Node *temp = head;
        while (loop-- > 0) {
            temp = temp->next;
        }
        Node *deleteNode = temp->next;
        temp->next = temp->next->next;
        free(deleteNode);
        return head;
    }
}

Node* createNodes(int size){
    if(size == 0) return NULL;
    Node *head, *temp;
    head = new Node(1);
    head->incrementSize();
    temp = head;
    for(int i = 2; i <= size; i++){
        temp->next = new Node(i);
        temp->incrementSize();
        temp = temp->next;
    }
    return head;
}

void printNodes(Node *head, int size){
    Node *temp = head;
    cout << "HEAD -> ";
    for(int i = 0; i < size; i++){
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL\n";
    return;
}

int main(){
    Node *head = createNodes(10);
    printNodes(head, head->size());
    cout << "Size of Linked List is: " << head->size() << "\n";
    head = insertNode(head, 14, 120);
    printNodes(head, head->size());
    cout << "Size of Linked List is: " << head->size() << "\n";
    head = deleteNode(head, 13);
    printNodes(head, head->size());
    cout << "Size of Linked List is: " << head->size() << "\n";
    return 0;
}