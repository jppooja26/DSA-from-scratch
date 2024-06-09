//Time complexity - O(n)
//Space complexity - O(1)
package LinkedList;
import java.util.Scanner;
class Node2 {
    int data;
    Node2 next;
    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}
class CLinkedList {
    Node2 head,tail;
    public CLinkedList() {
        head = null;
        tail = null;
    }
    public void insert_beg(int val) { //Time complexity - O(1) Space complexity - O(1)
        Node2 newNode = new Node2(val);
        if(head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
        System.out.println("Insertion completed!");
    }
    public void insert_mid(int pos, int val) { //Time complexity - O(n) Space complexity - O(1)
        if(pos == 0) {
            insert_beg(val);
            return;
        }
        Node2 newNode = new Node2(val);
        Node2 curr = head;
        int count = 0;
        while(curr.next!=head) {
            if(pos-1==count) {
                newNode.next = curr.next;
                curr.next = newNode;
                if(newNode.next == head) {
                    tail = newNode;
                }
                return;
            }
            count++;
            curr = curr.next;
        }
        if(curr.next == head && pos-1 == count) {
            insert_end(val);
            return;
        }
        System.out.println("Insertion completed!");
    }
    public void insert_end(int val) { //Time complexity - O(1) Space complexity - O(1)
        Node2 newNode = new Node2(val);
        if(tail == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        System.out.println("Insertion completed!");
    }
    public void update(int oldVal, int newVal) { //Time complexity - O(n) Space complexity - O(1)
        Node2 curr = head;
        do {
            if(curr.data == oldVal) {
                curr.data = newVal;
                return;
            }
            curr = curr.next;
        } while(curr!=head);
        System.out.println("Updation completed!");
    }
    public void del_beg() { //Time complexity - O(1) Space complexity - O(1)
        if(head == null) return;
        if(head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
        System.out.println("Deletion completed!");
    }
    public void del_mid(int pos) { //Time complexity - O(n) Space complexity - O(1)
        if(pos == 0) {
            del_beg();
            return;
        }
        Node2 curr = head;
        Node2 prev = null;
        int count = 0;
        while(curr.next!=head) {
            if(pos==count) {
                prev.next = curr.next;
                if(curr == tail) {
                    tail = prev;
                }
                return;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
        if(curr.next == head && pos == count) {
            del_end();
            return;
        }
        System.out.println("Deletion completed!");
    }
    public void del_end() { //Time complexity - O(n) Space complexity - O(1)
        if(tail == null) return;
        if(head == tail) {
            head = tail = null;
            return;
        }
        Node2 curr = head;
        while(curr.next!=tail) {
            curr = curr.next;
        }
        tail = curr;
        tail.next = head;
        System.out.println("Deletion completed!");
    }
    public void display() { //Time complexity - O(n) Space complexity - O(1)
        System.out.print("Linked list elements: ");
        Node2 curr = head;
        do {
            System.out.print(curr.data+" ");
            curr = curr.next;
        } while(curr!=head);
        System.out.println();
    }
}
public class circular_linked {
    public static void main(String[] args) {
        int ch,pos;
        Scanner sc = new Scanner(System.in);
        CLinkedList obj = new CLinkedList();
        do {
            System.out.println("***MENU****");
            System.out.println("1. Insert at beginning\n2. Insert at middle\n3. Insert at end\n4. Update\n5. Delete at beginning\n6. Delete at middle\n7. Delete at end\n8. Display\n9. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    obj.insert_beg(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    obj.insert_mid(pos,sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    obj.insert_end(sc.nextInt());
                    break;
                case 4: 
                    System.out.print("Enter old value: ");
                    int oldVal = sc.nextInt();
                    System.out.print("Enter new value: ");
                    obj.update(oldVal,sc.nextInt());
                    break;
                case 5:
                    obj.del_beg();
                    break;
                case 6: 
                    System.out.print("Enter position: ");
                    obj.del_mid(sc.nextInt());
                    break;
                case 7:
                    obj.del_end();
                    break;
                case 8: 
                    obj.display();
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