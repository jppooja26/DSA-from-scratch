//Time complexity - O(1)
//Space complexity - O(n)
package Stack;
import java.util.Scanner;
import java.util.Stack;
public class dynamicstack {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        do {
            System.out.println("***MENU****");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: //Time complexity - O(1)
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println(val+" pushed to stack");
                    break;
                case 2: //Time complexity - O(1)
                    if(stack.isEmpty())
                        System.out.println("Stack is empty!");
                    else
                        System.out.println(stack.pop()+" popped from stack");
                    break;
                case 3: //Time complexity - O(1)
                    if(stack.isEmpty()) 
                        System.out.println("Peek: -1");
                    else
                        System.out.println("Peek: "+ stack.peek());
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
