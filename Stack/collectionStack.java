//Stack implementation using Collections package
//Time complexity - O(1)
//Space compliexity - O(n)
package Stack;
import java.util.Scanner;
import java.util.Stack;
public class collectionStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        Stack<Integer> stack = new Stack<>();
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
                    stack.push(val);
                    System.out.println("Pushed "+ val+" to stack");
                    break;
                case 2:
                    if(!stack.isEmpty())
                        System.out.println("Popped "+stack.pop()+" from stack");
                    else
                        System.out.println("Empty stack");
                    break;
                case 3:
                    if(!stack.isEmpty())
                        System.out.println("Peek: "+stack.peek());
                    else
                        System.out.println("Peek: -1");
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
