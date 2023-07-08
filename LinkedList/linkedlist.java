package LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
class Demo {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> ll;
    public void create() {
        ll = new LinkedList<>();
        System.out.println("LinkedList creation completed");
    }
    public void intbeg() {
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        ll.addFirst(val);
        System.out.println("Insertion completed");
    }
    public void intmid() {
        System.out.print("Enter index: ");
        int ind = sc.nextInt();
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        ll.add(ind,val);
        System.out.println("Insertion completed");
    }
    public void intend() {
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        ll.addLast(val);
        System.out.println("Insertion completed");
    }
    public void update() {
        System.out.print("Enter index: ");
        int ind = sc.nextInt();
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        ll.set(ind,val);
        System.out.println("Updation completed");
    }
    public void delbeg() {
        ll.removeFirst();
        System.out.println("Deletion completed");
    }
    public void delmid() {
        System.out.print("Enter index: ");
        int ind = sc.nextInt();
        ll.remove(ind);
        System.out.println("Deletion completed");
    }
    public void delend() {
        ll.removeLast();
        System.out.println("Deletion completed");
    }
    public void display() {
        System.out.print("LinkedList elements: ");
        for(int i=0;i<ll.size();i++) {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
    }
}
public class linkedlist {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***MENU***");
            System.out.println("1. Create\n2. Insert at beginning\n3. Insert at middle\n4. Insert at end\n5. Update\n6. Delete at beginning\n7. Delete at middle\n8. Delete at end\n9. Display\n10. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    obj.create();
                    break;
                case 2:
                    obj.intbeg();
                    break;
                case 3:
                    obj.intmid();
                    break;
                case 4:
                    obj.intend();
                    break;
                case 5:
                    obj.update();
                    break;
                case 6:
                    obj.delbeg();
                    break;
                case 7:
                    obj.delmid();
                    break;
                case 8:
                    obj.delend();
                    break;
                case 9:
                    obj.display();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break; 
            }
        }while(true);
    }
}
