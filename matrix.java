//Space complexity - O(r*c)
import java.util.Scanner;
public class matrix {
    static int arr[][];
    static int r,c;
    static Scanner sc = new Scanner(System.in);
    public static void insert(int[][] arr) { //Time complexity - O(r*c)
        System.out.println("Enter matrix elements");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void update(int[][] arr) { //Time complexity - O(1)
        System.out.print("Enter row to be updated: ");
        int r1 = sc.nextInt();
        System.out.print("Enter column to be updated: ");
        int c1 = sc.nextInt();
        System.out.print("Enter value: ");
        arr[r1][c1] = sc.nextInt();
        System.out.println("Matrix updated");
    }
    public static int[][] delete(int[][] arr) { //Time complexity - O(r*c)
        System.out.print("Enter row to be deleted: ");
        int r1 = sc.nextInt();
        for(int i=r1+1;i<arr.length;i++) {
            arr[i-1] = arr[i];
        }
        int[][] arr1 = new int[arr.length-1][arr[0].length];
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr1[i][j] = arr[i][j];
            }
        }
        return arr1;
    }
    public static void display(int[][] arr) { //Time complexity - O(r*c)
        System.out.println("Matrix elements");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***MENU***");
            System.out.println("1. Create\n2. Insert\n3. Update\n4. Delete\n5. Display\n6. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1: //creation of matrix
                    System.out.print("Enter row length: ");
                    r = sc.nextInt();
                    System.out.print("Enter column length: ");
                    c = sc.nextInt();
                    arr = new int[r][c]; 
                    System.out.println("Matrix created");
                    break;
                case 2:
                    insert(arr);
                    break;
                case 3:
                    update(arr);
                    break;
                case 4:
                    arr=delete(arr);
                    break;
                case 5:
                    display(arr);
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
