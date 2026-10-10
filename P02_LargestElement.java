
/*


Problem: Find the Largest Element in an Array
Given an array of N integers, find and print the largest element.


*/
import java.util.Scanner;

public class P02_LargestElement {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the size of the array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sobj.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("Largest element is : " + max);

    }
}