
//Find the second-largest distinct element in an integer array without using built-in sorting methods.

import java.util.Scanner;

public class P05_SecondLargestElement {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sobj.nextInt();

        if (size < 2) {
            System.out.println("Second largest element does not exist");
            sobj.close();
            return;
        }

        int arr[] = new int[size];

        System.out.println("Enter the elements in a single line : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sobj.nextInt();
        }

        Integer max = null;
        Integer secondMax = null;

        for (int i = 0; i < size; i++) {
            int num = arr[i];

            if (max == null || num > max) {
                if (max != null) {
                    secondMax = max;
                }
                max = num;
            } else if (num < max && (secondMax == null || num > secondMax)) {
                secondMax = num;
            }
        }

        if (secondMax == null) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element : " + secondMax);
        }

        sobj.close();
    }

}
