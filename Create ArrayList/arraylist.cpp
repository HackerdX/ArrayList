#include<bits/stdc++.h>
using namespace std;
class ArrayList1{
    private:
        int *a;
        int size;
        int capacity;
        int size_factor;
    
    public:
        ArrayList1(){
            a = new int[2];
            size = 0;
            capacity = 0;
            size_factor = 1;
        }

        void add(int number){
            if(size == capacity){
                capacity = pow(2, ++size_factor);
                int *t = new int[capacity];
                for(int i = 0; i < size; i++){
                    t[i] = a[i];
                }
                a = t;
            }
            a[size++] = number;
        }

        int length(){
            return size;
        }

        int get(int index){
            return a[index];
        }

        int getCapacity(){
            return capacity;
        }

        int update(int location, int value){
            if(location > (length() - 1) || location < 0) {
                cout << "Access error ";
                return 0;
            } else{
                a[location] = value;
                return 1;
            }
        }

        void erase(int location){
            if(location < 0 || location > size) {cout << "invalid location "; return; }
            if(location >= 0 && length() == 0) {cout << "No element to delete "; return; }
            for(int i = location; i < size - 1; i++){
                a[i] = a[i+1];
                cout << a[i] << " ";
            }
            size--;
            cout << "size: "<<size<<"\n";
        }

        void print(){
            for(int i = 0; i < length(); i++){
                cout << a[i] << " ";
            }
        }
};
int main(){
    ArrayList1 arr;
    arr.add(5631);
    arr.add(23783);
    arr.add(74783);
    arr.add(4373);
    arr.add(5267);
    // arr.print();
    // arr.update(arr.length(), 200);
    // arr.update(-1, 500);
    // arr.update(2, 100);
    // arr.print();
    // for(int i = 0; i < arr.length(); i++){
        arr.erase(0);
        arr.erase(1);
        arr.erase(2);
        arr.erase(3);
        arr.erase(4);
    // }
    arr.print();
    cout << arr.length() << " ";

    return 0;
}