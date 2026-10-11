//Count Even Numbers in an Array

import java.util.Scanner;

public class P03_CountEvenNumbers {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];
        int count = 0;
        System.out.println("Enter the elements in a single line : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sobj.nextInt();
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of Even Numbers in an Array : " + count);

    }

}
