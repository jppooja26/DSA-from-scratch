//Time complexity - O(n)
//Space complexity - O(1)
package LinkedList;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }
    public void insert_beg(int val) { //Time complexity - O(1) Space complexity - O(1)
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion completed!");
    }
    public void insert_mid(int pos, int val) { //Time complexity - O(n) Space complexity - O(1)
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        Node prev = null;
        int count = 0; 
        while(curr!=null) {
            if(count==pos) {
                newNode.next = curr;
                prev.next = newNode;
                return;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Insertion completed!");
    }
    public void insert_end(int val) { //Time complexity - O(n) Space complexity - O(1)
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;
        }
        curr.next = newNode;
        System.out.println("Insertion completed!");
    }
    public void update(int oldVal, int newVal) { //Time complexity - O(n) Space complexity - O(1)
        Node curr = head;
        while(curr!=null) {
            if(curr.data==oldVal) {
                curr.data = newVal;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Updation completed!");
    }
    public void del_beg() { //Time complexity - O(1) Space complexity - O(1)
        if(head==null) 
            return;
        head = head.next;
        System.out.println("Deletion completed!");
    }
    public void del_mid(int val) { //Time complexity - O(n) Space complexity - O(1)
        if(head==null)
            return;
        Node curr = head;
        Node prev = null;
        while(curr!=null) {
            if(curr.data==val) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Deletion completed!");
    }
    public void del_end() { //Time complexity - O(n) Space complexity - O(1)
        if(head==null)
            return;
        if(head.next==null) {
            head = null;
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr.next!=null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        System.out.println("Deletion completed!");
    }
    public void display() { //Time complexity - O(n) Space complexity - O(1)
        Node curr = head;
        System.out.print("Linked list elements: ");
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
public class static_linked {
    public static void main(String[] args) {
        int ch,pos;
        Scanner sc = new Scanner(System.in);
        LinkedList obj = new LinkedList();
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
                    System.out.print("Enter new value");
                    obj.update(oldVal,sc.nextInt());
                    break;
                case 5:
                    obj.del_beg();
                    break;
                case 6: 
                    System.out.print("Enter value: ");
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