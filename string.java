//Space complexity - O(1)
import java.util.Scanner;
class Task {
    Scanner sc = new Scanner(System.in);
    String str;
    public void insert() { //Time complexity - O(1)
        System.out.print("Enter string: ");
        str = sc.nextLine();
        System.out.println("String insertion completed");
    }
    public void len() { //Time complexity - O(1)
        System.out.println("String length: "+ str.length());
    }
    public void substring() { //Time complexity - O(end-start)
        System.out.print("Enter starting and ending index: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Substring: "+str.substring(start, end));
    }
    public void compare() { //Time complexitiy - O(n+m)
        System.out.print("Enter string for comparison: ");
        String str1 = sc.nextLine();
        if(str.compareTo(str1)<0)
            System.out.println(str+" is "+str.compareTo(str1)+" times lower than "+str1);
        else
            System.out.println(str+" is "+str.compareTo(str1)+" times greater than "+str1);
    }
    public void concat() { //Time complexity - O(n+m)
        System.out.print("Enter string to concat: ");
        String str1 = sc.nextLine();
        System.out.println("Concatenated string: "+str.concat(str1));
    }
    public void equal() { //Time complexity - O(n+m)
        System.out.print("Enter string to compare: ");
        String str1 = sc.nextLine();
        if(str.equals(str1))
            System.out.println(str+" and "+str1+" are equal");
        else
            System.out.println(str+" and "+str1+" are not equal");
    }
}
public class string {
    public static void main(String[] args) {
        Task obj = new Task();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***MENU***");
            System.out.println("1. Insert\n2. Length\n3. Substring\n4. Compare\n5. Concatenate\n6. Equal\n7. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.len();
                    break;
                case 3:
                    obj.substring();
                    break;
                case 4:
                    obj.compare();
                    break;
                case 5:
                    obj.concat();
                    break;
                case 6:
                    obj.equal();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(true);
    }
}