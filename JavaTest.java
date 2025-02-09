package com.maybank.web;

import java.text.SimpleDateFormat;
import java.util.*;

class JavaTest {
	// E.g. Input: Automation, Output: noitamotuA
	// Please don't use method such as s.reverse()
	public static String reverseStringWithoutUsingStringMethod(String s) {

		char[] chars = s.toCharArray();
		int left = 0, right = chars.length - 1;
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}
	
	// Sort the integer in ASC order without using the built-in method such as ArrayUtils.sort
	public static Integer[] sortIntegers(Integer[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
		
	}
	
	// Check if the given date is within the date range
	public static boolean isInDateRange(Date givenDate, Date startDate, Date endDate) {
		return givenDate.compareTo(startDate) >= 0 && givenDate.compareTo(endDate) <= 0;
	}
	
	// sort the given String in ASC order without using method like Arrays.sort
	public static char[] sortStringInAscOrder(String input) {
		char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = 0; j < chars.length - i - 1; j++) {
				if (chars[j] > chars[j + 1]) {
					char temp = chars[j];
					chars[j] = chars[j + 1];
					chars[j + 1] = temp;
				}
			}
		}
		return chars;
	}
	
	// Given a Alphanumeric, please return a character with the lowest occurrence
	// E.g. AbcdAbc123123, the answer is d as it only occurs once
	// If there is more than 1 char with the same lowest occurrence, return the first char in ASC order
	public static char lowestOccurrence(String input) {
		Map<Character, Integer> freqMap = new HashMap<>();
		for (char c : input.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		char minChar = Character.MAX_VALUE;
		int minCount = Integer.MAX_VALUE;

		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() < minCount || (entry.getValue() == minCount && entry.getKey() < minChar)) {
				minCount = entry.getValue();
				minChar = entry.getKey();
			}
		}
		return minChar;
	}
	
	// Given the array of Integer, please apply the provided equations (+, -, x)
	// E.g. input: 1, 2, 3; equations: x*x, x*2-3, x*5+1
	// Answer: 1st equation: 1*1, 2*2, 3*3 = 1, 4, 9
	//         2nd equation: 1*2-3, 4*2-3, 9*2-3 = -1, 5, 15
	//         3rd equation: -1*5+1, 5*5+1, 15*5+1 = -4, 26, 76
	//         return { -4, 26, 76 }
	public static Integer[] solveEquations(Integer[] input, String[] equations) {

		Integer[] result = Arrays.copyOf(input, input.length);
		for (String equation : equations) {
			for (int i = 0; i < result.length; i++) {
				int x = result[i];
				result[i] = evaluateEquation(x, equation);
			}
		}
		return result;
	}
	// Evaluate a mathematical expression given an integer x
	private static int evaluateEquation(int x, String equation) {
		equation = equation.replace("x", String.valueOf(x));
		return evaluateExpression(equation);
	}

	// Evaluate simple arithmetic expressions
	private static int evaluateExpression(String expression) {
		Stack<Integer> stack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		int num = 0;
		char prevOperator = '+';

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0');
			}

			if (!Character.isDigit(c) && c != ' ' || i == expression.length() - 1) {
				if (prevOperator == '+') {
					stack.push(num);
				} else if (prevOperator == '-') {
					stack.push(-num);
				} else if (prevOperator == '*') {
					stack.push(stack.pop() * num);
				}
				prevOperator = c;
				num = 0;
			}
		}

		int result = 0;
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Test 1: " + reverseStringWithoutUsingStringMethod("Automation"));
		Integer[] intArray = new Integer[] { 10, 12, 54, 1, 2, -9, 8 };
		System.out.print("Test 2: ");
		for (Integer i : intArray) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Date startDate = sdf.parse("2024-12-01 13:09:22");
			Date endDate = sdf.parse("2025-01-09 20:10:12");
			Date givenDate = sdf.parse("2025-02-02 00:11:22");
			System.out.println("Test 3: " + isInDateRange(givenDate, startDate, endDate));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		char[] sorted = sortStringInAscOrder("testingNG311");
		System.out.print("Test 4 :");
		for (char c: sorted) {
			System.out.print(c + ", ");
		}
		System.out.println();
		System.out.println("Test 5: " + lowestOccurrence("Abc1dd23affbc1ee23u3278"));
		System.out.print("Test 6: ");
		Integer[] equationArray = solveEquations(new Integer [] { 1, 2, 3 }, new String[] { "x*x", "x*3-5", "x+6-10" });
		for (Integer i : equationArray) {
			System.out.print(i + ", ");
		}
	}
}

