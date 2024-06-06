//Time complexity - O(n*m)
//Space complexity - O(n*m)
package Array;
import java.util.Scanner;
public class matrix {
    static int[][] mat; 
    static int n, m;
    static Scanner sc = new Scanner(System.in);
    public static void create() { //Time complexity - O(n)
        System.out.print("Enter matrix row length: ");
        n = sc.nextInt();
        System.out.print("Enter matrix column length: ");
        m = sc.nextInt();
        mat = new int[n][m];
        System.out.println("Matrix created!");
    }
    public static void read() { //Time complexity - O(n*m)
        System.out.print("Enter matrix elements: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Insertion completed!");
    }
    public static void update() { //Time complexity - O(1)
        System.out.print("Enter row of the element to be updated: ");
        int row = sc.nextInt();
        System.out.print("Enter column of the element to be updated: ");
        int col = sc.nextInt();
        System.out.print("Enter value: ");
        mat[row][col] = sc.nextInt();
        System.out.println("Updation completed!");
    }
    public static void delete() { //Time complexity - O(1)
        System.out.print("Enter row of the element to be deleted: ");
        int row = sc.nextInt();
        System.out.print("Enter column of the element to be deleted: ");
        int col = sc.nextInt();
        mat[row][col] = 0;
        System.out.println("Deletion completed!");
    }
    public static void display() { //Time complexity - O(n*m)
        System.out.println("Matrix elements");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
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