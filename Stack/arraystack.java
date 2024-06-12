//Time complexity - O(1)
//Space complexity - O(n)
package Stack;
import java.util.Scanner;
class Stack {
    int maxSize;
    int top;
    int[] stack;
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }
    public void push(int val) { //Time complexity - O(1)
        if(isFull())
            System.out.println("Stack full. Cannot push "+ val+" to stack");
        else {
            stack[++top] = val;
            System.out.println(val+" pushed to stack");
        }
    }
    public void pop() { //Time complexity - O(1)
        if(isEmpty())
            System.out.println("Stack is empty!");
        else 
            System.out.println(stack[top--]+" popped from stack");
    }
    public void peek() { //Time complexity - O(1)
        if(isEmpty())
            System.out.println("Peek: -1");
        else
            System.out.println("Peek: "+ stack[top]);
    }
    public boolean isFull() { //Time complexity - O(1)
        return (top==maxSize-1);
    }
    public boolean isEmpty() { //Time complexity - O(1)
        return (top==-1);
    }
}
public class arraystack {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Stack obj = new Stack(5);
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