package Array;
import java.util.Scanner;
public class array {
    static int[] arr; 
    static int n;
    static Scanner sc = new Scanner(System.in);
    public static void create() {
        System.out.print("Enter array length: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Array created");
    }
    public static void read() {
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Insertion completed");
    }
    public static void update() {
        System.out.print("Enter index of the element to be updated: ");
        int ind = sc.nextInt();
        System.out.print("Enter value: ");
        arr[ind] = sc.nextInt();
        System.out.println("Updation completed");
    }
    public static void delete() {
        System.out.print("Enter index of the element to be deleted: ");
        int ind = sc.nextInt();
        if(ind == n-1) 
            arr[n-1] = 0;
        else {
            for(int i=ind;i<n-1;i++) {
                arr[i] = arr[i+1];
            }
            arr[n-1] = 0;
        }
        System.out.println("Deletion completed");
    }
    public static void display() {
        System.out.print("Array elements: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
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