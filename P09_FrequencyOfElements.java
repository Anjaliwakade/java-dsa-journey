
//Given an integer array, print each distinct element and its frequency.
import java.util.Scanner;

public class P09_FrequencyOfElements {

    public static void main(String[] args) 
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sobj.nextInt();

        }

        int iCount = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean isalreadySeen = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isalreadySeen = true;
                    break;
                }
            }
            if (!isalreadySeen) {
                iCount = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {

                        iCount++;
                    }

                }

                System.out.println(arr[i] + " -> " + iCount + " times");

            }

        }

    }
