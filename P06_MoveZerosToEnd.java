
//Given an integer array, move all zeros to the end of the array while maintaining the relative order of all non-zero elements.

import java.util.Scanner;

public class P06_MoveZerosToEnd {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        if (size < 1) {
            System.out.println("Invalid size");
            sobj.close();
            return;

        }

        System.out.print("Enter the element :  ");
        for (int i = 0; i < size; i++) {
            arr[i] = sobj.nextInt();
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;

            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sobj.close();

    }

}
