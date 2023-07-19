//Stack implementation using array
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
    public void push(int value) {
        if(isFull()) 
            System.out.println("Stack full. Cannot push "+value);
        else {
            stack[++top] = value;
            System.out.println("Pushed "+value+" to stack");
        }
    }
    public void pop() {
        if(isEmpty())
            System.out.println("Stack is empty");
        else 
            System.out.println("Popped "+stack[top--]+" from stack");
    }
    public int peek() {
        if(isEmpty())
            return -1;
        else
            return (stack[top]);
    }
    public boolean isEmpty() {
        return (top==-1);
    }
    public boolean isFull() {
        return (top==maxSize-1);
    }
}
public class arrayStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack obj = new Stack(5);
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