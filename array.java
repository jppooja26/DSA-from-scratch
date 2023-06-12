import java.util.Scanner;
class Operation {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] arr;
    public void create() {
        System.out.print("Enter length of the array: ");
        n = sc.nextInt();
        arr = new int[n]; //memory allocation for array of length n
        System.out.println("Array created");
    }

    public void insert() {
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Insertion completed");
    }

    public void update() {
        System.out.print("Enter index to be updated: ");
        int pos = sc.nextInt();
        System.out.print("Enter value: ");
        arr[pos] = sc.nextInt();
        System.out.println("Updation completed");
    }

    public void delete() {
        System.out.print("Enter index to be deleted: ");
        int pos = sc.nextInt(); 
        if(pos == n-1) //replacing null if it is the final element
            arr[n-1] = 0;
        else{ 
            for(int i=pos;i<n-1;i++) {
                arr[i] = arr[i+1]; //moving successive elements to their index before
            }
            arr[n-1] = 0; 
        }
        System.out.println("Deletion completed");
    }

    public void display() {
        System.out.print("Array elements: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class array {
    public static void main(String[] args) {
        Operation obj = new Operation();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n***MENU***");
            System.out.println("1. Create\n2. Insert\n3. Update\n4. Delete\n5. Display\n6. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    obj.create();
                    break;
                case 2:
                    obj.insert();
                    break;
                case 3:
                    obj.update();
                    break;
                case 4:
                    obj.delete();
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(true);
    }
}
