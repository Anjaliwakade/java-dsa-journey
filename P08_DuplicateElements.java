//Write a Java program to find and print the duplicate elements in an integer array.

import java.util.Scanner;

public class P08_DuplicateElements {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        System.out.println(" Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Duplicate elements : ");

        for (int i = 0; i < arr.length; i++) {
            boolean alreadySeen = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = 0; k < i; k++) {
                        if (arr[i] == arr[k]) {
                            alreadySeen = true;
                            break;

                        }
                    }
                    if (!alreadySeen) {
                        System.out.print(arr[i] + " ");
                        break;
                    }

                }
            }

        }

    }

}
