#include<bits/stdc++.h>
using namespace std;
class Node{
    public:
        int data;
        Node *next;
        Node(int data){
            this->data = data;
            this->next = NULL;
        }
};
Node* createNodes(int size){
    if(size == 0) return NULL;
    Node *head, *temp;
    head = new Node(1);
    temp = head;
    for(int i = 2; i <= size; i++){
        temp->next = new Node(i);
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
int getSizeOfLinkedList(Node *head){
    if(head == NULL) return 0;
    int count = 0;
    Node *temp = head;
    while(temp != NULL){
        count++;
        temp = temp->next;
    }
    return count;
}
int main(){
    Node *head = createNodes(190);
    int getSize = getSizeOfLinkedList(head);
    printNodes(head, getSize);
    cout << "Size of Linked List is: " << getSize << "\n";
    return 0;
}