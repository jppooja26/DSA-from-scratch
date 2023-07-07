//Space complexity - O(n)
import java.util.ArrayList;
import java.util.Scanner;
class Sample {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr;
    public void create() { //Time complexity - O(1)
        arr = new ArrayList<>();
        System.out.println("Arraylist creation completed");
    }
    public void insert() { //Time complexity - O(n)
        System.out.print("Enter arraylist elements(-1 on exit): ");
        while(true) {
            int val = sc.nextInt();
            if(val == -1)
                break;
            arr.add(val);
        }
        System.out.println("Insertion completed");
    }
    public void update() { //Time complexity - O(1)
        System.out.print("Enter index to be updated: ");
        int ind = sc.nextInt();
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        arr.set(ind,val);
        System.out.println("Updation completed");
    }
    public void delete() { //Time complexity - O(1)
        System.out.print("Enter index to de deleted: ");
        int ind = sc.nextInt();
        arr.remove(ind);
        System.out.println("Deletion completed");
    }
    public void display() { //Time complexity - O(n)
        System.out.print("Arraylist elements: ");
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}
public class arraylist {
    public static void main(String[] args) {
        Sample obj = new Sample();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***MENU***");
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
        } while(true);
    }
}
