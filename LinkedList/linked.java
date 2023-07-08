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
    public void intbeg(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion completed");
    }
    public void intmid(int pos, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        Node prev = null;
        int count=0;
        while(current != null) {
            if(count==pos) {
                newNode.next = current;
                prev.next = newNode;
            }
            count++;
            prev= current;
            current = current.next;
        }
        System.out.println("Insertion completed");
    }
    public void intend(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Insertion completed");
    }
    public void update(int oldVal, int newVal) {
        Node current = head;
        while(current != null) {
            if(current.data == oldVal) {
                current.data = newVal;
                return;
            }
            current = current.next;
        }
        System.out.println("Updation completed");
    }
    public void delbeg() {
        if(head==null)
            return;
        head = head.next;
        System.out.println("Deletion completed");
    }
    public void delmid(int data) {
        if(head==null)
            return;
        Node current = head;
        Node prev = null;
        while(current != null) {
            if(current.data == data) {
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Deletion completed");
    }
    public void delend() {
        if(head==null)
            return;
        if(head.next==null) {
            head = null;
            return;
        }
        Node current = head;
        Node prev = null;
        while(current.next!=null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        System.out.println("Deletion completed");
    }
    public void display() {
        System.out.print("LinkedList elements: ");
        Node current = head;
        while(current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
public class linked {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***MENU***");
            System.out.println("1. Insert at beginning\n2. Insert at middle\n3. Insert at end\n4. Update\n5. Delete at beginning\n6. Delete at middle\n7. Delete at end\n8. Display\n9. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    System.out.print("Enter value: ");
                    int data = sc.nextInt();
                    ll.intbeg(data);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    ll.intmid(pos,data);
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    ll.intend(data);
                    break;
                case 4:
                    System.out.print("Enter old value: ");
                    int oldVal = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int newVal = sc.nextInt();
                    ll.update(oldVal,newVal);
                    break;
                case 5:
                    ll.delbeg();
                    break;
                case 6:
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    ll.delmid(data);
                    break;
                case 7:
                    ll.delend();
                    break;
                case 8:
                    ll.display();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break; 
            }
        }while(true);
    }
}
