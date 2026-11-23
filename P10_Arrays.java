//Day 1 – Arrays (Part 1)

int arr={10,20,30,40,50};

System.out.println(arr[0]);System.out.println(arr[1]);System.out.println(arr[2]);System.out.println(arr[3]);System.out.println(arr[4]);

for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}
//////////////////////////////////////

1. What is an Array?

An array is a data structure that stores multiple values of the same data type in a single variable.

int[]arr={10,20,30,40,50};

-Stores multiple values of the same type.-Array elements are accessed using indexes.-Index starts from 0.-Array has a fixed length after creation.

Remember:Array index starts from 0.

3. Array Declaration int[]arr;

4. Array Initialization int[]arr=new int[5];

This creates an array of size 5. For int,the default values are 0.

int[]arr={10,20,30,40,50};

5. Array Length arr.length

-length gives the total number of elements.-Array uses length,not length().

////////////////////////////////////////

Array Traversal

Traversal means visiting each element of an array one by one.int[]arr={10,20,30,40};

for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}

Time Complexity:O(n)

Because each element is visited once.

Space Complexity:O(1)

Because no additional data structure is used.7.Accessing Array Elements int[]arr={10,20,30,40};

System.out.println(arr[2]);

Time Complexity:O(1)

Accessing an element using an index takes constant time.

Operation Time Complexity Access by index O(1)Traversal O(n)Search(Linear)O(n)Update by index O(1)

///////////////////////////////////

Find the Largest Element in an Array

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < length; i++) {
            arr[i] = sobj.nextInt();
        }

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element is : " + largest);

        sobj.close();

    }
}

/////////////////////////////

Find the
Smallest Element
in an
Array

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < length; i++) {
            arr[i] = sobj.nextInt();
        }

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("smallest element is : " + smallest);

        sobj.close();

    }
}

/////////////////////////////////////

Find the
Second Largest
Element in
an
Array

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the length of the array : ");int length=sobj.nextInt();

        int arr[]=new int[length];

        System.out.println("Enter the elements : ");for(int i=0;i<length;i++){arr[i]=sobj.nextInt();}

        int largest=Integer.MIN_VALUE;int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){if(arr[i]>largest){secondlargest=largest;largest=arr[i];

        }else if((arr[i]<largest)&&(arr[i]>0 secondlargest)){secondlargest=arr[i];}}

        System.out.println("Largest element is : "+largest);System.out.println("Largest element is : "+secondlargest);

        sobj.close();

    }
}

///////////////////////////////

Arrays–

Interview Question 5
// Reverse an Array

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < length; i++) {
            arr[i] = sobj.nextInt();
        }

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element is : " + largest);

        sobj.close();

    }
}

///////////////////////////////

Arrays–

Interview Question 5
Reverse an
Array

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < length; i++) {
            arr[i] = sobj.nextInt();
        }

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("smallest element is : " + smallest);

        sobj.close();

    }
}

//////////////////////////

// Reverse an Array

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < length; i++) {
            arr[i] = sobj.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        sobj.close();

    }
}

//////////////////////////////////////

// Move All Zeros to the End

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < length; i++) {
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
            System.out.print(arr[i] + ", ");
        }

    }
}

Use an
index variable
to track
the next position for
a non-zero element.

Traverse the
array and
copy non-
zero elements
to the
front.

        Fill the
remaining positions
with zeros.

Preserve the
relative order
of non-
zero elements.

Time Complexity:

O(n)

Space Complexity: O(1)

////////////////////////////////////////