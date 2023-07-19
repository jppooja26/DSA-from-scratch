//Stack implementation using LinkedList
package Stack;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackLinked {
    Node top;
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed "+value+" to stack");
    }
    public void pop() {
        if(isEmpty())
            System.out.println("Empty stack");
        else {
            System.out.println("Popped "+top.data+" from stack");
            top = top.next;
        }
    }
    public int peek() {
        if(isEmpty())
            return -1;
        else
            return top.data;
    }
    public boolean isEmpty() {
        return (top==null);
    }
}
public class linkedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinked obj = new StackLinked();
        int ch;
        do {
            System.out.println("***MENU***");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    obj.push(val);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    System.out.println("Peek: "+obj.peek());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while(ch!=-1);
    }
}
