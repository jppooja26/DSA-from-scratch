//Stack implementation using Collections package
//Time complexity - O(1)
//Space compliexity - O(n)
package Queue;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;
public class collectionQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        Queue<Integer> queue = new PriorityQueue<>();
        do {
            System.out.println("***MENU***");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    queue.add(val);
                    System.out.println(val+" added to queue");
                    break;
                case 2:
                    if(!queue.isEmpty())
                        System.out.println(queue.remove()+" removed from queue");
                    else
                        System.out.println("Empty queue");
                    break;
                case 3:
                    if(!queue.isEmpty())
                        System.out.println("Peek: "+queue.peek());
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

