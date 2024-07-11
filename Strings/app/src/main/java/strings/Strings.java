package strings;

// Class to perform operations on String, StringBuffer, and StringBuilder
class HaveString {

    // Methods for String operations
    // Concatenates two strings and returns the result
    public String concatenateString(String str1, String str2) {
        return str1 + str2;
    }

    // Returns the length of the input string
    public int lengthOfString(String str) {
        return str.length();
    }

    // Returns the character at the specified index in the string
    public char charAtString(String str, int index) {
        return str.charAt(index);
    }

    // Returns a substring of the input string from beginIndex (inclusive) to endIndex (exclusive)
    public String substringString(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    // Replaces occurrences of oldChar with newChar in the input string and returns the modified string
    public String replaceString(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    // Methods for StringBuffer operations
    // Appends a string to the given StringBuffer and returns the modified StringBuffer
    public StringBuffer appendStringBuffer(StringBuffer sb, String str) {
        return sb.append(str); // Corrected to return StringBuffer
    }

    // Returns the length of the input StringBuffer
    public int lengthOfStringBuffer(StringBuffer sb) {
        return sb.length();
    }

    // Returns the character at the specified index in the StringBuffer
    public char charAtStringBuffer(StringBuffer sb, int index) {
        return sb.charAt(index);
    }

    // Returns a substring of the input StringBuffer from start index to end index
    public StringBuffer substringStringBuffer(StringBuffer sb, int start, int end) {
        return new StringBuffer(sb.substring(start, end)); // Corrected to return StringBuffer
    }

    // Replaces the substring from start to end in the input StringBuffer with the given string
    // and returns the modified StringBuffer
    public StringBuffer replaceStringBuffer(StringBuffer sb, int start, int end, String str) {
        return sb.replace(start, end, str); // Corrected to return StringBuffer
    }

    // Methods for StringBuilder operations
    // Appends a string to the given StringBuilder and returns the modified StringBuilder
    public StringBuilder appendStringBuilder(StringBuilder sb, String str) {
        return sb.append(str); // Corrected to return StringBuilder
    }

    // Returns the length of the input StringBuilder
    public int lengthOfStringBuilder(StringBuilder sb) {
        return sb.length();
    }

    // Returns the character at the specified index in the StringBuilder
    public char charAtStringBuilder(StringBuilder sb, int index) {
        return sb.charAt(index);
    }

    // Returns a substring of the input StringBuilder from start index to end index
    public StringBuilder substringStringBuilder(StringBuilder sb, int start, int end) {
        return new StringBuilder(sb.substring(start, end)); // Corrected to return StringBuilder
    }

    // Replaces the substring from start to end in the input StringBuilder with the given string
    // and returns the modified StringBuilder
    public StringBuilder replaceStringBuilder(StringBuilder sb, int start, int end, String str) {
        return sb.replace(start, end, str); // Corrected to return StringBuilder
    }
}

// Main class to demonstrate usage of the HaveString class
public class Strings {
    public static void main(String[] args) {
        HaveString hs = new HaveString();  // Create an instance of HaveString class

        // String operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Concatenate: " + hs.concatenateString(str1, str2)); // Concatenate strings
        System.out.println("Length: " + hs.lengthOfString(str1)); // Get length of string
        System.out.println("Char at index 1: " + hs.charAtString(str1, 1)); // Get character at index
        System.out.println("Substring (1, 4): " + hs.substringString(str1, 1, 4)); // Get substring
        System.out.println("Replace 'l' with 'p': " + hs.replaceString(str1, 'l', 'p')); // Replace characters

        // StringBuffer operations
        StringBuffer sbf = new StringBuffer("Hello");
        hs.appendStringBuffer(sbf, "World"); // Append string to StringBuffer
        System.out.println("Append: " + sbf); // Print modified StringBuffer
        System.out.println("Length: " + hs.lengthOfStringBuffer(sbf)); // Get length of StringBuffer
        System.out.println("Char at index 1: " + hs.charAtStringBuffer(sbf, 1)); // Get character at index in StringBuffer
        System.out.println("Substring (1, 4): " + hs.substringStringBuffer(sbf, 1, 4)); // Get substring from StringBuffer
        hs.replaceStringBuffer(sbf, 1, 4, "xyz"); // Replace substring in StringBuffer
        System.out.println("Replace (1, 4, 'xyz'): " + sbf); // Print modified StringBuffer

        // StringBuilder operations
        StringBuilder sbd = new StringBuilder("Hello");
        hs.appendStringBuilder(sbd, "World"); // Append string to StringBuilder
        System.out.println("Append: " + sbd); // Print modified StringBuilder
        System.out.println("Length: " + hs.lengthOfStringBuilder(sbd)); // Get length of StringBuilder
        System.out.println("Char at index 1: " + hs.charAtStringBuilder(sbd, 1)); // Get character at index in StringBuilder
        System.out.println("Substring (1, 4): " + hs.substringStringBuilder(sbd, 1, 4)); // Get substring from StringBuilder
        hs.replaceStringBuilder(sbd, 1, 4, "xyz"); // Replace substring in StringBuilder
        System.out.println("Replace (1, 4, 'xyz'): " + sbd); // Print modified StringBuilder
    }
}
