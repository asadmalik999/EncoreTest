# JavaTest Utility Functions

## Overview
This Java program contains utility functions that perform various operations such as reversing a string, sorting integers, checking date ranges, sorting characters, finding the lowest occurrence of a character, and solving mathematical equations.

## Features
- **Reverse String**: Reverses a given string without using built-in methods like `StringBuilder.reverse()`.
- **Sort Integers**: Sorts an array of integers in ascending order without using built-in sorting functions.
- **Date Range Checker**: Checks if a given date falls within a specified date range.
- **Sort String Characters**: Sorts the characters in a string in ascending order without using `Arrays.sort()`.
- **Lowest Occurrence Character**: Finds the character with the lowest occurrence in an alphanumeric string.
- **Solve Equations**: Applies a set of mathematical equations to an array of integers.

## Usage

### 1. Reverse a String
```java
System.out.println(reverseStringWithoutUsingStringMethod("Automation"));
```
**Expected Output**: `noitamotuA`

### 2. Sort an Array of Integers
```java
Integer[] intArray = { 10, 12, 54, 1, 2, -9, 8 };
Integer[] sortedArray = sortIntegers(intArray);
System.out.println(Arrays.toString(sortedArray));
```
**Expected Output**: `[-9, 1, 2, 8, 10, 12, 54]`

### 3. Check If a Date Is Within a Range
```java
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Date startDate = sdf.parse("2024-12-01 13:09:22");
Date endDate = sdf.parse("2025-01-09 20:10:12");
Date givenDate = sdf.parse("2025-02-02 00:11:22");

System.out.println(isInDateRange(givenDate, startDate, endDate));
```
**Expected Output**: `false` (since the given date is outside the range)

### 4. Sort Characters in a String
```java
char[] sortedChars = sortStringInAscOrder("testingNG311");
System.out.println(Arrays.toString(sortedChars));
```
**Expected Output**: `[1, 1, 3, G, N, e, g, i, n, s, t, t]`

### 5. Find the Character with the Lowest Occurrence
```java
System.out.println(lowestOccurrence("Abc1dd23affbc1ee23u3278"));
```
**Expected Output**: `'d'`

### 6. Solve Mathematical Equations
```java
Integer[] results = solveEquations(new Integer[] {1, 2, 3}, new String[] {"x*x", "x*3-5", "x+6-10"});
System.out.println(Arrays.toString(results));
```
**Expected Output**: `[-4, 26, 76]`

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/JavaTest.git
   cd JavaTest
   ```
2. Compile and run:
   ```sh
   javac JavaTest.java
   java JavaTest
   ```

## Requirements
- Java 8 or later
- IDE (Optional): IntelliJ IDEA, Eclipse, or VS Code

## Contributing
Feel free to submit pull requests or issues to improve this utility.

## License
This project is licensed under the MIT License.

---

Happy coding! 🚀
