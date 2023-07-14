//Time complexity - O(n)
//Space complexity - O(n)
package Search;
import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value to be searched: ");
        int k = sc.nextInt();
        //Linear search
        boolean found = false;
        int pos = -1;
        for(int i=0;i<n;i++) {
            if(arr[i] == k) {
                found = true;
                pos = i+1;
                break;
            }
        }
        if(found)
            System.out.println("Element found at position "+pos);
        else
            System.out.println("Element not found!");
    }
}

/* Moreover, linear search can also be applied for other data structures like LinkedList, Stack, Queue 
   even with strings which are typically treated as sequence of characters.
*/