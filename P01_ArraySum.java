/*
Problem Statement
Given an array of \(N\) integers, write a Java program to calculate and print the sum of all elements in the array.


Input Format
- The first line contains an integer \(N\), representing the size of the array.
- The second line contains \(N\) space-separated integers.

Output Format
Print a single integer representing the sum of all array elements.

Sample Input
5
10 20 30 40 50


Sample Output
150


*/

import java.util.Scanner;

public class P01_ArraySum {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " numbers on a single line : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array is : " + sum);

    }

}