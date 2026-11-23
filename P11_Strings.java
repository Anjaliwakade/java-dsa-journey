public class P11_Strings {

}

/*
 * 
 * 1. What is a String?
 * 
 * String name = "Anjali";
 * 
 * 
 * String = Data type
 * name = Variable
 * "Anjali" = String value
 * 
 * 
 * A. String Declaration
 * String str = "Hello";
 * 
 * 
 * B. Find String Length
 * String str = "Hello";
 * 
 * System.out.println(str.length());
 * 
 * 
 * Output:
 * 5
 * 
 * 
 * लक्षात ठेव:
 * - Array: arr.length
 * - String: str.length()
 * 
 * C. Access Characters
 * String str = "Hello";
 * 
 * System.out.println(str.charAt(0));
 * 
 * Output:
 * H
 * 
 * /////////////////////////////////
 * 
 * 
 * String s1 = "Java";
 * String s2 = "Java";
 * 
 * System.out.println(s1.equals(s2));
 * 
 * 
 * Output:
 * true
 * 
 * == compares references.
 * .equals() compares String content.
 * 
 * 
 * String is a sequence of characters.
 * String is an object in Java.
 * Strings are immutable in Java.
 * length() returns the number of characters.
 * charAt(index) returns a character at the specified index.
 * equals() compares String content.
 * == compares object references.
 * 
 * 
 * 4. Important String Methods
 * Method Purpose
 * length() Returns length
 * charAt() Returns character
 * equals() Compares content
 * equalsIgnoreCase() Compares ignoring case
 * toUpperCase() Converts to uppercase
 * toLowerCase() Converts to lowercase
 * substring() Extracts part of String
 * contains() Checks if text exists
 * trim() Removes leading/trailing spaces
 * ///////////////////////////
 * 
 * 
 * String vs StringBuilder vs StringBuffer
 * 
 * String is immutable
 * 
 * String str = "Hello";
 * 
 * str.concat(" Java");
 * 
 * System.out.println(str);
 * 
 * 
 * 
 * 
 * String is immutable.
 * 
 * ///////////////////////////
 * 
 * StringBuilder – Mutable
 * 
 * Mutable means we can change content in existing object.
 * 
 * StringBuilder sb = new StringBuilder("Hello");
 * sb.append("java");
 * System.out.println(sb);
 * 
 * Useful methods:
 * - append() – content add करणे.
 * - reverse() – reverse करणे.
 * - insert() – मध्ये content add करणे.
 * - delete() – content delete करणे.
 * 
 * /////////////////////////////////
 * 
 * C. StringBuffer – Mutable + Thread-Safe
 * 
 * C. StringBuffer – Mutable + Thread-Safe
 * StringBuffer सुद्धा StringBuilder प्रमाणेच mutable आहे.
 * StringBuffer sb = new StringBuffer("Hello");
 * 
 * sb.append(" Java");
 * 
 * System.out.println(sb);
 * 
 * 
 * Output:
 * Hello Java
 * 
 * 
 * मग StringBuilder आणि StringBuffer मध्ये फरक काय?
 * 
 * StringBuffer चे methods synchronized असतात. त्यामुळे multiple threads एकाच
 * वेळी त्यावर काम करताना ते thread-safe असते.
 * 
 * ///////////////////////////////////
 * 
 * 
 * - String is immutable.
 * - StringBuilder is mutable and not synchronized.
 * - StringBuffer is mutable and synchronized.
 * - StringBuilder is generally preferred for string modifications in
 * single-threaded code.
 * - StringBuffer is useful when synchronized access is required.
 * 
 * ///////////////////////////////
 * 
 * equals() vs ==
 * 
 * दोन्ही compare करतात, पण वेगवेगळ्या गोष्टी compare करतात.
 * - == → दोन references एकाच object कडे point करतात का?
 * - equals() → objects मधील content समान आहे का? हे संबंधित class च्या
 * implementation वर depend करते.
 * 
 * 
 * String s1 = new String("java");
 * String s2 = new String("java");
 * 
 * System.out.println(s1 == s2);
 * System.out.println(s1.equals(s2));
 * 
 * // false
 * //true
 * 
 * s1 == s2 → false, कारण दोन्ही वेगवेगळे objects आहेत.
 * s1.equals(s2) → true, कारण दोन्हींचा content "Java" आहे.
 * 
 * /////////////////////////////////
 * 
 * Example 2: StringBuilder
 * 
 * Stringbuilder is mutable
 * 
 * StringBuilder sb = new StringBuilder("Hello");
 * 
 * sb.append(" java");
 * 
 * System.out.println(sb);
 * 
 * //Hello Java
 * 
 * 
 * इथे नवीन StringBuilder object तयार करण्याची गरज नाही. Existing object मध्येच
 * content add होतो.
 * 
 * Useful methods:
 * - append() – content add करणे.
 * - reverse() – reverse करणे.
 * - insert() – मध्ये content add करणे.
 * - delete() – content delete करणे.
 * 
 * ///////////////////////////////////////
 * 
 * C. StringBuffer – Mutable + Thread-Safe
 * 
 * it is also mutable
 * 
 * StringBuffer sb = new StringBuffer("Hello");
 * sb.append(" java");
 * System.out.println(sb);
 * 
 * 
 * Stringbuffer is a method synchronized.
 * so multiple thread can wor at a time and that time they are thread safe.
 * 
 * 
 * String is immutable.
 * StringBuilder is mutable and not synchronized.
 * 
 * StringBuffer is mutable and synchronized.
 * StringBuilder is generally preferred for string modifications in
 * single-threaded code.
 * StringBuffer is useful when synchronized access is required.
 * 
 * /////////////////////////////
 * 
 * equals() vs ==
 * 
 * 
 * 
 * == → दोन references एकाच object कडे point करतात का?
 * 
 * 
 * 
 * equals() → objects मधील content समान आहे का? हे संबंधित class च्या
 * implementation वर depend करते.
 * 
 * 
 * String s1 = new String("Java");
 * String s2 = new String("Java");
 * 
 * System.out.println(s1 == s2);
 * System.out.println(s1.equals(s2));
 * 
 * Output
 * false
 * true
 * 
 * - s1 == s2 → false, कारण दोन्ही वेगवेगळे objects आहेत.
 * - s1.equals(s2) → true, कारण दोन्हींचा content "Java" आहे
 * 
 * ///////////////////////////////////////
 * 
 * Example 2: StringBuilder
 * StringBuilder sb1 = new StringBuilder("Java");
 * StringBuilder sb2 = new StringBuilder("Java");
 * 
 * System.out.println(sb1 == sb2);
 * System.out.println(sb1.equals(sb2));
 * 
 * 
 * Output:
 * false
 * false
 * 
 * 
 * का?
 * 
 * StringBuilder मध्ये equals() method content compare करण्यासाठी override
 * केलेली नाही. त्यामुळे त्याचं equals() सुद्धा references compare करतं.
 * 
 * ///////////////////////////////////////////////
 * 
 * 
 * Example 3: StringBuffer
 * StringBuffer sb1 = new StringBuffer("Java");
 * StringBuffer sb2 = new StringBuffer("Java");
 * 
 * System.out.println(sb1 == sb2);
 * System.out.println(sb1.equals(sb2));
 * 
 * 
 * Output:
 * false
 * false
 * 
 * 
 * StringBuffer मध्येही equals() content comparison करत नाही.
 * 
 * String
 * equals() → Content compare
 * 
 * == → Reference compare
 * 
 * 
 * StringBuilder
 * equals() → Reference compare
 * 
 * == → Reference compare
 * 
 * 
 * StringBuffer
 * equals() → Reference compare
 * 
 * == → Reference compare
 * 
 * 
 * ///////////////////////////////////////
 * 
 * 
 * String is immutable.
 * StringBuilder is mutable and not thread-safe.
 * StringBuffer is mutable and thread-safe.
 * StringBuilder is generally faster than StringBuffer for modifications.
 * == compares object references.
 * String's equals() compares content.
 * StringBuilder and StringBuffer do not override equals() for content
 * comparison.
 * 
 * /////////////////////////////////////////////
 * 
 * 
 * 
 * 
 * 
 */