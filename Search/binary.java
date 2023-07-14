//Time complexity - O(nlogn)
//Space complexity - O(n)
package Search;
import java.util.Scanner;
import java.util.Arrays;
public class binary {
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
        Arrays.sort(arr); //Time Complexity - O(nlogn)
        //Binary Search
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while(left<=right) { //Time complexity - O(logn)
            int mid = left + (right-left)/2;
            if(arr[mid]==k) {
                found = true;
                System.out.println("Value found at "+mid);
                System.exit(0);
            }
            else if(arr[mid]>k) 
                right = mid - 1;
            else
                left = mid + 1;
        }
        if(!found)
            System.out.println("Value not found!");
    }
}
/* Moreover, binary search can also be applied for other data structures like LinkedList, trees etc
*/
