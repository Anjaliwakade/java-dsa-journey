
import java.util.Scanner;

public class P12_ReverseString {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            rev = rev + ch;

        }

        System.out.println(rev);
        sobj.close();
    }

}

/*
 * Start the loop from the last index.
 * 
 * 
 * 
 * Use charAt(i) to access each character.
 * 
 * 
 * 
 * Append each character to the reversed String.
 * 
 * 
 * 
 * Continue until index 0.
 * 
 * 
 * 
 * Time Complexity: O(n²) with repeated String concatenation.
 * 
 * 
 * 
 * Space Complexity: O(n) for the resulting String (excluding temporary
 * allocations).
 * 
 */

// Approach 2: StringBuilder

String str = "Java";

StringBuilder sb = new StringBuilder(str);

String rev = sb.reverse().toString();

System.out.println(rev);

StringBuilder is mutable.reverse()
reverses the characters.toString()
converts StringBuilder
into String.
StringBuilder is
more efficient
than repeated
String concatenation
inside a
loop.



//////////////////////////////


String str = "Programming";

StringBuilder sb = new StringBuilder(str);

sb.reverse();

System.out.pritnln(sb);

//////////////////////////////////
