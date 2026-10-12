
//Reverse an Array

import java.util.Scanner;

public class P04_ReverseArray {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sobj.nextInt();
        }

        System.out.print("Reverse array elements : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
