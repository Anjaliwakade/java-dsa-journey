/*
Find the Missing Number

Problem Statement
You are given an array containing distinct numbers from 1 to n, with one number missing. Write a Java program to find the missing number.
*/

import java.util.Scanner;

public class P07_FindMissingNumber {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sobj.nextInt();

        if (size < 2) {
            System.out.println("array size should be grater thean 1");
            sobj.close();
            return;
        }

        int arr[] = new int[size - 1];
        int array_sum = 0;

        System.out.println("Enter the elements  : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
            array_sum += arr[i];

        }

        int expectedSum = size * (size + 1) / 2;

        int missingNumber = expectedSum - array_sum;

        System.out.println("Missing number : " + missingNumber);

        sobj.close();

    }

}
