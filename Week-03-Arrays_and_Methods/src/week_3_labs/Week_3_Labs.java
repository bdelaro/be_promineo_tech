package week_3_labs;

public class Week_3_Labs {
	public static void main(String[] args) {
		// create an array with the following values 1,5,2,8,13,6
		int[] array = { 1, 5, 2, 8, 13, 6 };

		// print out the first element in the array
		System.out.println(array[0]);

		// print out the last element in the array without using the number 5
		System.out.println(array[array.length - 1]);

		// print out the element in the array at position 6. What happens?
		// System.out.println(array[array.length]); zero based, the last element will
		// always be length of array minus 1, out of bounds

		// print out the element in the array at position -1. What happens?
		// System.out.println(array[-1]); arrays start at 0, out of bounds

		// write a traditional for loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// write an enhanced for loop that prints out each element in the array
		for (int number : array) {
			System.out.println(number);
		}

		// create a new variable called sum, write a loop that adds each element in the
		// array to the sum
		double sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);

		// create a new variable called average and assign the average value of the
		// array to it
		double average = 0;
		average = sum / array.length;
		System.out.println(average);

		// write an enhanced for loop that prints out each number in the array only if
		// the number is odd
		for (int number : array) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}

		// create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		String[] arrayNames = { "Sam", "Sally", "Thomas", "Robert" };

		// calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String x : arrayNames) {
			sumOfLetters += x.length();
		}
		System.out.println(sumOfLetters);

		// write and test a method that takes a String name and prints out a greeting,
		// this method returns nothing
		greet("Adam");
		greet("Alex");

		// write and test a method that takes a String name and returns a greeting, do
		// not print in the method
		greet2("Bob");
		System.out.println(greet2("Bob"));

		// analyze the difference between these two methods - what do you find? How are
		// they different?
		// The first one takes the input, performs the task on the input, and then
		// prints it out, the second option just takes the input, performs the task on
		// the input, then returns the result, leaving the last step open-ended for
		// other actions to be
		// performed on it, if needed

		// write and test a method that takes a String and an int and returns true if
		// the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("bob", 2));

		// write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array
		String[] strings = { "blue", "chicken", "fries" };
		System.out.println(isStringInArray(strings, "red"));

		// write and test a method that takes an array of int and returns the smallest
		// number in the array
		System.out.println(smallestNumberInArray(array));

		// write and test a method that takes an array of double and returns the average
		double[] doubles = { 1, 2.3, 3 };
		System.out.println(averageOfDoubleArray(doubles));

		// write and test a method that takes an array of Strings and returns an array
		// of int where each element
		// matches the length of the string at that position
		for (int x : lengthOfEachStringArrayElement(arrayNames)) {
			System.out.println(x);
		}

		// write and test a method that takes an array of strings and returns true if
		// the sum of letters for all strings with an
		// even amount of letters is greater than the sum of those with an odd amount of
		// letters.
		System.out.println(evenOrOddGreater(arrayNames));

		// write and test a method that takes a string and returns true if the string is
		// a palindrome
	}

	public static void greet(String name) {
		System.out.println("Hi, my name is " + name + ".");
	}

	public static String greet2(String name) {
		return "Hi, my name is " + name + ".";
	}

	public static boolean isStringLongerThanNumber(String word, int number) {
		return word.length() > number;
	}

	public static boolean isStringInArray(String[] strings, String string) {
		for (String x : strings) {
			if (x.equals(string)) {
				return true;
			}
		}
		return false;
	}

	public static int smallestNumberInArray(int[] array) {
		int smallest = array[0];
		for (int x : array) {
			if (smallest > x) {
				smallest = x;
			}
		}
		return smallest;
	}

	public static double averageOfDoubleArray(double[] array) {
		double sum = 0;
		for (double x : array) {
			sum += x;
		}
		return sum / array.length;
	}

	public static int[] lengthOfEachStringArrayElement(String[] strings) {
		int[] lengthOfElements = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			lengthOfElements[i] = strings[i].length();
		}
		return lengthOfElements;
	}

	public static boolean evenOrOddGreater(String[] strings) {
		int evenSums = 0, oddSums = 0;
		for (String x : strings) {
			if (x.length() % 2 == 0) {
				evenSums += x.length();
			} else {
				oddSums += x.length();
			}
		}
		return evenSums > oddSums;
	}
	
	public static boolean checkForPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
		
}
