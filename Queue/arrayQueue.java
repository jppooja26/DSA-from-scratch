//Queue implementation using array
//Time complexity - O(1)
//Space complexity - O(n)
package Queue;
import java.util.Scanner;
class Queue {
    int front = -1, rear = -1;
    int[] queue;
    public Queue(int size) {
        queue = new int[size];
    }
    public void enqueue(int data) {
        if(isFull()) 
            System.out.println("Queue full");
        else if(isEmpty()) {
            queue[++front] = data;
            ++rear;
        }
        else {
            queue[++rear] = data;
        }
        System.out.println(data+" added to queue");
    }
    public void dequeue() {
        if(isEmpty())
            System.out.println("Queue empty");
        else if(front == rear) {
            System.out.println(queue[front]+" removed from queue");
            front = rear = -1;
        }
        else {
            System.out.println(queue[front++]+" removed from queue");
        }
    }
    public void peek() {
        if(isEmpty())
            System.out.println("Peek: -1");
        else {
            System.out.println("Peek: "+queue[front]);
        }
    }
    public boolean isFull() {
        return rear == queue.length - 1;
    }
    public boolean isEmpty() {
        return front == -1;
    }
}
public class arrayQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue obj = new Queue(5);
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
