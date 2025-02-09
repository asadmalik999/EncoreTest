JavaTest

Overview

JavaTest is a Java class that demonstrates various fundamental programming tasks without using built-in utility methods. The tasks include string reversal, sorting integers, checking date ranges, and evaluating mathematical expressions dynamically.

Features

Reverse a string without using built-in methods like StringBuilder.reverse().

Sort an array of integers without using built-in sorting methods like Arrays.sort().

Check if a given date falls within a specified date range.

Sort a given string in ascending order without using Arrays.sort().

Find the character with the lowest occurrence in an alphanumeric string.

Apply a series of mathematical equations to an array of integers.

Methods

1. reverseStringWithoutUsingStringMethod(String s)

Description: Reverses a given string without using built-in reverse methods.

Example Input:

reverseStringWithoutUsingStringMethod("Automation");

Example Output:

noitamotuA

2. sortIntegers(Integer[] array)

Description: Sorts an array of integers in ascending order without using built-in sorting methods.

Example Input:

sortIntegers(new Integer[]{10, 12, 54, 1, 2, -9, 8});

Example Output:

[-9, 1, 2, 8, 10, 12, 54]

3. isInDateRange(Date givenDate, Date startDate, Date endDate)

Description: Checks if a given date is within the specified date range.

Example Input:

isInDateRange(givenDate, startDate, endDate);

Example Output:

true or false

4. sortStringInAscOrder(String input)

Description: Sorts the characters of a given string in ascending order without using built-in sorting methods.

Example Input:

sortStringInAscOrder("testingNG311");

Example Output:

"1, 1, 3, G, N, e, g, i, n, s, t, t"

5. lowestOccurrence(String input)

Description: Finds the character with the lowest occurrence in an alphanumeric string. If multiple characters have the same lowest occurrence, the first character in ASCII order is returned.

Example Input:

lowestOccurrence("Abc1dd23affbc1ee23u3278");

Example Output:

'd'

6. solveEquations(Integer[] input, String[] equations)

Description: Applies a series of mathematical equations to an array of integers and returns the final computed values.

Example Input:

solveEquations(new Integer [] { 1, 2, 3 }, new String[] { "x*x", "x*3-5", "x+6-10" });

Example Output:

[-4, 26, 76]

Usage

Run the main method to execute test cases for each method.

How to Compile and Run

Ensure you have Java 8 or later installed.

Save the file as JavaTest.java.

Open a terminal and navigate to the directory containing the file.

Compile the Java program:

javac JavaTest.java

Run the program:

java JavaTest

Dependencies

Java 8+

Author

Malik Asad Ali Manzoor
