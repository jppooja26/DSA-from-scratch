//Time complexity - O(n)
//Space complexity - O(1)
package LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
public class dynamic_linked {
    static LinkedList<Integer> ll;
    static Scanner sc = new Scanner(System.in);
    public static void create() { //Time complexity - O(1) Space complexity - O(1)
        ll = new LinkedList<>();
        System.out.println("Linked list creation completed!");
    }
    public static void insert_beg() { //Time complexity - O(1) Space complexity - O(1)
        System.out.print("Enter value: ");
        ll.addFirst(sc.nextInt());
        System.out.println("Insertion completed!");
    }
    public static void insert_mid() { //Time complexity - O(n) Space complexity - O(1)
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter value: ");
        ll.add(pos,sc.nextInt());
        System.out.println("Insertion completed!");
    }
    public static void insert_end() { //Time complexity - O(1) Space complexity - O(1)
        System.out.print("Enter value: ");
        ll.addLast(sc.nextInt());
        System.out.println("Insertion completed!");
    }
    public static void update() { //Time complexity - O(n) Space complexity - O(1)
        System.out.print("Enter index: ");
        int ind = sc.nextInt();
        System.out.print("Enter value: ");
        ll.set(ind, sc.nextInt());
        System.out.println("Updation completed!");
    }
    public static void del_beg() { //Time complexity - O(1) Space complexity - O(1)
        ll.removeFirst();
        System.out.println("Deletion completed!");
    }
    public static void del_mid() { //Time complexity - O(n) Space complexity - O(1)
        System.out.print("Enter index: ");
        ll.remove(sc.nextInt());
        System.out.println("Deletion completed!");
    }
    public static void del_end() { //Time complexity - O(1) Space complexity - O(1)
        ll.removeLast();
        System.out.println("Deletion completed!");
    }
    public static void display() { //Time complexity - O(n) Space complexity - O(1)
        System.out.print("Linked list elements: ");
        for(int i=0;i<ll.size();i++) {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("***MENU****");
            System.out.println("1. Create\n2. Insert at beginning\n3. Insert at middle\n4. Insert at end\n5. Update\n6. Delete at beginning\n7. Delete at middle\n8. Delete at end\n9. Display\n10. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    create();
                    break;
                case 2:
                    insert_beg();
                    break;
                case 3:
                    insert_mid();
                    break;
                case 4: 
                    insert_end();
                    break;
                case 5:
                    update();
                    break;
                case 6: 
                    del_beg();
                    break;
                case 7:
                    del_mid();
                    break;
                case 8:
                    del_end();
                    break;
                case 9:
                    display();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while(ch!=-1);
    }
}