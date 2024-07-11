# Operations on String, StringBuffer, and StringBuilder in Java

This Java program demonstrates operations on `String`, `StringBuffer`, and `StringBuilder` classes through the `HaveString` and `Strings` classes.

## Overview

The program includes methods in the `HaveString` class to perform various operations on strings (`String`), mutable strings (`StringBuffer`), and mutable strings with better performance (`StringBuilder`). It showcases basic operations such as concatenation, length retrieval, character access, substring extraction, and substring replacement.

## `HaveString` Class

### String Operations

- **concatenateString(String str1, String str2)**: Concatenates two input strings (`str1` and `str2`) and returns the resulting string.
- **lengthOfString(String str)**: Retrieves the length of the input string (`str`).
- **charAtString(String str, int index)**: Returns the character at the specified index in the input string (`str`).
- **substringString(String str, int beginIndex, int endIndex)**: Retrieves a substring from `beginIndex` (inclusive) to `endIndex` (exclusive) from the input string (`str`).
- **replaceString(String str, char oldChar, char newChar)**: Replaces occurrences of `oldChar` with `newChar` in the input string (`str`) and returns the modified string.

### StringBuffer Operations

- **appendStringBuffer(StringBuffer sb, String str)**: Appends a string (`str`) to the input `StringBuffer` (`sb`) and returns the modified `StringBuffer`.
- **lengthOfStringBuffer(StringBuffer sb)**: Retrieves the length of the input `StringBuffer` (`sb`).
- **charAtStringBuffer(StringBuffer sb, int index)**: Returns the character at the specified index in the input `StringBuffer` (`sb`).
- **substringStringBuffer(StringBuffer sb, int start, int end)**: Retrieves a substring from `start` index to `end` index from the input `StringBuffer` (`sb`).
- **replaceStringBuffer(StringBuffer sb, int start, int end, String str)**: Replaces the substring from `start` to `end` in the input `StringBuffer` (`sb`) with the given string (`str`) and returns the modified `StringBuffer`.

### StringBuilder Operations

- **appendStringBuilder(StringBuilder sb, String str)**: Appends a string (`str`) to the input `StringBuilder` (`sb`) and returns the modified `StringBuilder`.
- **lengthOfStringBuilder(StringBuilder sb)**: Retrieves the length of the input `StringBuilder` (`sb`).
- **charAtStringBuilder(StringBuilder sb, int index)**: Returns the character at the specified index in the input `StringBuilder` (`sb`).
- **substringStringBuilder(StringBuilder sb, int start, int end)**: Retrieves a substring from `start` index to `end` index from the input `StringBuilder` (`sb`).
- **replaceStringBuilder(StringBuilder sb, int start, int end, String str)**: Replaces the substring from `start` to `end` in the input `StringBuilder` (`sb`) with the given string (`str`) and returns the modified `StringBuilder`.

## `Strings` Class

### Main Method

The `Strings` class contains the `main` method where:
- An instance of the `HaveString` class (`hs`) is created.
- Various operations are performed using `hs` to demonstrate string manipulation capabilities across `String`, `StringBuffer`, and `StringBuilder`.
- Results are printed to the console to show the outcome of each operation.

## Running the Program

To run the program:
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Compile the Java file:
   ```sh
   javac Strings.java
   ```
3. Run the compiled class:
   ```sh
   java Strings
   ```

## Example Output

Upon running the program, you should see output similar to the following:

```
Concatenate: HelloWorld
Length: 5
Char at index 1: e
Substring (1, 4): ell
Replace 'l' with 'p': Heppo

Append: HelloWorld
Length: 10
Char at index 1: e
Substring (1, 4): ell
Replace (1, 4, 'xyz'): Hxyzoworld

Append: HelloWorld
Length: 10
Char at index 1: e
Substring (1, 4): ell
Replace (1, 4, 'xyz'): Hxyzoworld
```

## Conclusion

This program demonstrates fundamental operations on strings (`String`), mutable strings (`StringBuffer`), and mutable strings with better performance (`StringBuilder`) in Java. It emphasizes the differences in mutability and performance between these classes and provides practical examples of their usage for string manipulation tasks.