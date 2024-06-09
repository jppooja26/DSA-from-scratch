//Time complexity - O(n)
//Space complexity - O(1)
package LinkedList;
import java.util.Scanner;
class Node1 {
    int data;
    Node1 prev;
    Node1 next;
    public Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DLinkedList {
    Node1 head, tail;
    public DLinkedList() {
        head = null;
        tail = null;
    }
    public void insert_beg(int val) { //Time complexity - O(1) Space complexity - O(1)
        Node1 newNode1 = new Node1(val);
        if(head == null) {
            head = tail = newNode1;
            return;
        }
        newNode1.next = head;
        head.prev = newNode1;
        head = newNode1;
        System.out.println("Insertion completed!");
    }
    public void insert_mid(int pos, int val) { //Time complexity - O(n) Space complexity - O(1)
        if(pos == 0) {
            insert_beg(val);
            return;
        }
        Node1 newNode1 = new Node1(val);
        Node1 curr = head;
        int count = 0;
        while(curr!=null) {
            if(pos-1==count) {
                newNode1.next = curr.next;
                newNode1.prev = curr;
                curr.next = newNode1;
                curr.next.prev = newNode1;
                break;
            }
            count++;
            curr = curr.next;
        }
        if(curr == null) {
            insert_end(val);
            return;
        }
        System.out.println("Insertion completed!");
    }
    public void insert_end(int val) { //Time complexity - O(1) Space complexity - O(1)
        Node1 newNode1 = new Node1(val);
        if(tail == null) {
            head = tail = newNode1;
            return;
        }
        tail.next = newNode1;
        newNode1.prev = tail;
        tail = newNode1;
        System.out.println("Insertion completed!");
    }
    public void update(int oldVal, int newVal) { //Time complexity - O(n) Space complexity - O(1)
        Node1 curr = head;
        while(curr!=null) {
            if(curr.data == oldVal) {
                curr.data = newVal;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Updation completed!");
    }
    public void del_beg() { //Time complexity - O(1) Space complexity - O(1)
        if(head == null) return;
        if(head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
        System.out.println("Deletion completed!");
    }
    public void del_mid(int pos) { //Time complexity - O(n) Space complexity - O(1)
        if(pos==0) {
            del_beg();
            return;
        }
        Node1 curr = head;
        int count = 0;
        while(curr.next!=null) {
            if(pos == count) {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                return;
            }
            count++;
            curr = curr.next;
        }
        if(curr==tail) {
            del_end();
            return;
        }
        System.out.println("Deletion completed!");
    }
    public void del_end() { //Time complexity - O(1) Space complexity - O(1)
        if(tail == null) return;
        if(head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        System.out.println("Deletion completed!");
    }
    public void display() { //Time complexity - O(n) Space complexity - O(1)
        Node1 curr = head;
        System.out.print("Linked list elements: ");
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
public class doubly_linked {
    public static void main(String[] args) {
        int ch,pos;
        Scanner sc = new Scanner(System.in);
        DLinkedList obj1 = new DLinkedList();
        do {
            System.out.println("***MENU****");
            System.out.println("1. Insert at beginning\n2. Insert at middle\n3. Insert at end\n4. Update\n5. Delete at beginning\n6. Delete at middle\n7. Delete at end\n8. Display\n9. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    obj1.insert_beg(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    obj1.insert_mid(pos,sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    obj1.insert_end(sc.nextInt());
                    break;
                case 4: 
                    System.out.print("Enter old value: ");
                    int oldVal = sc.nextInt();
                    System.out.print("Enter new value: ");
                    obj1.update(oldVal,sc.nextInt());
                    break;
                case 5:
                    obj1.del_beg();
                    break;
                case 6: 
                    System.out.print("Enter position: ");
                    obj1.del_mid(sc.nextInt());
                    break;
                case 7:
                    obj1.del_end();
                    break;
                case 8: 
                    obj1.display();
                    break;
                case 9: 
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while(ch!=-1);
        sc.close();
    }
}