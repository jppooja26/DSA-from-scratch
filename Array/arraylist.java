//Time complexity - O(n)
//Space complexity - O(n)
package Array;
import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    static ArrayList<Integer> arr; 
    static Scanner sc = new Scanner(System.in);
    public static void create() { //Time complexity - O(1)
        arr = new ArrayList<>();
        System.out.println("Array created!");
    }
    public static void read() { //Time complexity - O(n)
        System.out.print("Enter array elements(-1 to exit): ");
        while(true) {
            int ele = sc.nextInt();
            if(ele!=-1) arr.add(ele);
            else break;
        }
        System.out.println("Insertion completed!");
    }
    public static void update() { //Time complexity - O(n)
        System.out.print("Enter index of the element to be updated: ");
        int ind = sc.nextInt();
        System.out.print("Enter value: ");
        arr.remove(ind);
        arr.add(ind, sc.nextInt());
        System.out.println("Updation completed!");
    }
    public static void delete() { //Time complexity - O(n)
        System.out.print("Enter index of the element to be deleted: ");
        int ind = sc.nextInt();
        arr.remove(ind);
        System.out.println("Deletion completed!");
    }
    public static void display() { //Time complexity - O(n)
        System.out.print("Array elements: ");
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("***MENU****");
            System.out.println("1. Create\n2. Read\n3. Update\n4. Delete\n5. Display\n6. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4: 
                    delete();
                    break;
                case 5:
                    display();
                    break;
                case 6: 
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while(ch!=-1);
    }
}