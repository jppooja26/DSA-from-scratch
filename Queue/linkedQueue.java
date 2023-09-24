//Queue implementation using Linkedlist
//Time complexity - O(1)
//Space complexity - O(N)
package Queue;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queuelink {
    Node front, rear;
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data+" added to queue");
    }
    public void dequeue() {
        if(isEmpty())
            System.out.println("Queue empty");
        else {
            System.out.println(front.data+" removed from queue");
            front = front.next;
        }
    }
    public void peek() {
        if(isEmpty())
            System.out.println("Queue empty");
        else
            System.out.println("Peek: "+front.data);
    }
    public boolean isEmpty() {
        return front == null;
    }
}
public class linkedQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queuelink obj = new Queuelink();
        do {
            System.out.println("***MENU***");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    obj.enqueue(val);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while(true);
    }
}
