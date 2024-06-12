//Time complexity - O(1)
//Space complexity - O(n)
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
class Stack1 {
    Node top;
    public void push(int val) { //Time complexity - O(1)
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        System.out.println(val+" pushed to stack");
    }
    public void pop() { //Time complexity - O(1)
        if(isEmpty()) 
            System.out.println("Stack is empty!");
        else {
            System.out.println(top.data+" popped from stack");
            top = top.next;
        }
    }
    public void peek() { //Time complexity - O(1)
        if(isEmpty())
            System.out.println("Peek: -1");
        else
            System.out.println("Peek: "+top.data);
    }
    public boolean isEmpty() { //Time complexity - O(1)
        return (top==null);
    }
}
public class linkedstack {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Stack1 obj = new Stack1();
        do {
            System.out.println("***MENU****");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    obj.push(sc.nextInt());
                    break;
                case 2:
                    obj.pop();
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
        } while(ch!=-1);
        sc.close();
    }
}
