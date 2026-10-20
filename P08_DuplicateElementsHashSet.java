
import java.util.HashSet;
import java.util.Scanner;

public class P08_DuplicateElementsHashSet {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])) {
                duplicates.add(arr[i]);

            }
        }

        System.out.print("Duplicate elements : ");

        for (int num : duplicates) {
            System.out.print(num + " ");
        }

        sobj.close();

    }

}
