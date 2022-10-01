package arrays_methods_assignment;

import java.util.Random;
import java.util.Scanner;

public class Arrays_Methods {
	
	static boolean run = true; //added this here to use in different methods, make it global
	static String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"}; //added this here to use in different methods, make it global
	static Scanner kb = new Scanner(System.in); //added this here to use in different methods, make it global
	
	public static void main(String[] args) {
		boolean exceptionCatch = true;
		try (Scanner kb = new Scanner(System.in)) {
			int questionNum = 0;
			System.out.println("Week 3-4 Coding Assignment");
			while(run) {
			System.out.print("Pick a number 1 - 13, to get corresponding answer to question (Enter zero to exit): ");
			
				while(exceptionCatch) {
					try{
						questionNum = kb.nextInt();
						break;
					}
					catch(Exception e) {
						kb.next();
						System.out.print("\nInvalid input.\nPick a number 1 - 13, to get corresponding answer to question (Enter zero to exit): ");
					}
				}
				
				if(questionNum >=0 && questionNum <=13) {
					System.out.println();
					getQuestion(questionNum);
				}
				else {
					System.out.println("Invalid input.");
				}
					System.out.println();
			}
		}
		
	}

//	Print loop for strings array
	private static void printLoopS(String[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

//	Print loop for numbers (int) array
	private static void printLoopN(int[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
//	Print loop for numbers (double) array
	private static void printLoopD(double[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
//	Simulates a 'clear console' to declutter the screen
	private static void clrscreen() {
		for (int i = 0; i < 15; ++i) {
			System.out.println();
		}
	}
	
	private static void getQuestion(int questionNum) {
		clrscreen();
		switch(questionNum) {
			case 1:
				question1();
				break;
			case 2:
				question2();
				break;
			case 3:
				question3();
				break;
			case 4:
				question4();
				break;
			case 5:
				question5();
				break;
			case 6:
				question6();
				break;
			case 7:
				question7();
				break;
			case 8:
				question8();
				break;
			case 9:
				question9();
				break;
			case 10:
				question10();
				break;
			case 11:
				question11();
				break;
			case 12:
				question12();
				break;
			case 13:
				question13();
				break;
			case 0:
				run = false;
				System.out.print("Thank you!\nCome again!");
				break;
			}
	}

	private static void question1() {
		System.out.println("Question 1: ");
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.			
				int[] ages = {3,9,23,64,2,8,28,93}; //length of 8
				printLoopN(ages);
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
//			(i.e. do not use ages[7] in your code). Print the result to the console.  	
				System.out.println((ages[ages.length-1])-ages[0]); // should print 90, 93-3
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//			Added 50 to the end of the group of ages and added to it a another array
				int[] newAges = {3,9,23,64,2,8,28,93,50}; //length of 9
				printLoopN(newAges);
//			Performed same logic as above for first array with new array that has a different length, to check if it works for arrays 
//			of different lengths
				System.out.println((newAges[newAges.length-1])-newAges[0]); // should print 47, 50-3
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.	
//			Calculating average age of both arrays 
				int sumAges=0,sumNewAges=0;
				for(int x = 0; x<ages.length;x++) {
					sumAges += ages[x];
					}
				System.out.println("Average age in Ages: " + (sumAges/ages.length));
				for(int y=0;y<newAges.length;y++) {
					sumNewAges += newAges[y];
					}
			System.out.println("Average age in newAges: " + (sumNewAges/newAges.length));
	}

	private static void question2(){
		System.out.println("Question 2: ");
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//			Added what's below this line, outside all methods, to use in other methods
//			String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//			To get decimal places, using double instead of int
			double sumOfLetters = 0;
			for(int i = 0;i < names.length;i++) {
				sumOfLetters += names[i].length();
			}
			System.out.printf("%.2f",sumOfLetters/names.length); //format output to two decimal places
			System.out.println();
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print 
//			the result to the console.
			for(int i = 0;i < names.length;i++) {
				System.out.print(names[i] + " ");
			}	
			System.out.println();
	}

	private static void question3() {
		System.out.println("Question 3: ");
//		3.	How do you access the last element of any array?
			System.out.println("To access the last element of any array, find the length of the array and subtract 1 from it to find \n"
				+ "the index of the last element, now with it, we can call it to manipulate it as needed.\n"
				+ "ex. 'array.length -1'\n"
				+ "'array[index] = action to it'");
	}

	private static void question4() {
		System.out.println("Question 4: ");
//		4.	How do you access the first element of any array?
			System.out.println("To access the first element of any array use, 'nameOfArray'[index] = 'action to it',"
					+ "\nalways has an index of 0.");
	}

	private static void question5() {
		System.out.println("Question 5: ");
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add 
//			the length of each name to the nameLengths array.
			int[] nameLengths = new int[names.length];
			for(int i = 0;i<nameLengths.length;i++) {
				nameLengths[i] += names[i].length();
			}
			printLoopS(names);
			printLoopN(nameLengths);
	}

	private static void question6() {
		System.out.println("Question 6: ");
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
//			Print the result to the console.
//			Copied question5 method to use nameLengths in this method, there could be a better way to do this
			int[] nameLengths = new int[names.length];
			for(int i = 0;i<nameLengths.length;i++) {
				nameLengths[i] += names[i].length();
				}
			int sumOfNameLengths = 0;
			for(int i = 0;i<nameLengths.length;i++) {
				sumOfNameLengths += nameLengths[i];
				}
			System.out.println(sumOfNameLengths);
	}

	private static void question7() {
		System.out.println("Question 7: ");
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
//		to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			String word = "";
			int n = 0;
			System.out.print("Please enter a word: ");
			word = kb.next();
			System.out.println("	Your word is: " + word);
			System.out.print("Please enter a number (greater than 0): ");
			n = kb.nextInt();
			System.out.println("	Your number is: " + n);
			System.out.println(methodForQuestion7(word, n));
	}
	
	private static String methodForQuestion7(String a, int b) {
		String c = "";
		for(int i = 0;i<b;i++) {
			c += a;
		}
		return c;
	}

	private static void question8() {
		System.out.println("Question 8: ");
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//		(the full name should be the first and the last name as a String separated by a space).
			String a="",b="";
			System.out.print("Please enter your first name: ");
			a = kb.next();
			System.out.print("Please enter your last name: ");
			b = kb.next();
			System.out.println("Welcome, " + methodForQuestion8(a, b)+".");
	}
	
	private static String methodForQuestion8(String a,String b) {
		String c = "";
		c = a + " " + b;
		return c;
	}

	private static void question9() {
		System.out.println("Question 9: ");
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			int x = 0;
			boolean z = false;
			System.out.print("Please enter size of array (greater than 0): ");
			x = kb.nextInt();
			int[] a = new int[x];
			Random randNum = new Random();
			for (int i = 0; i < x; i++) {
				a[i] = randNum.nextInt();
				}
			System.out.println("Array filled.");
			printLoopN(a);
			z = methodForQuestion9(a);
			if(z) {
				System.out.println(z+", the sum of all elements in the array is greater than 100.");
			}
			else {
				System.out.println(z+", the sum of all elements in the array is not greater than 100.");
			}
	}
	
	private static boolean methodForQuestion9(int[] a) {
		boolean c = false;
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum += a[i];
		}
		c = (sum>100);
		System.out.println("Sum of elements in array: " + sum);
		return c;
	}

	private static void question10() {
		System.out.println("Question 10: ");
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		int x = 0;
		System.out.print("Please enter size of array (greater than 0): ");
		x = kb.nextInt();
		double[] a = new double[x];
		Random randNum = new Random();
		for (int i = 0; i < x; i++) {
			a[i] = randNum.nextDouble();
			}
		System.out.println("Array filled.");
		printLoopD(a);
		System.out.println("Average is " + methodForQuestion10(a));
		
	}
	
	private static double methodForQuestion10(double[] a) {
		double sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	
	private static void question11() {
		System.out.println("Question 11: ");
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			int x = 0;
			System.out.print("Please enter size of array (greater than 0): ");
			x = kb.nextInt();
			double[] a = new double[x];
			Random randNum = new Random();
			for (int i = 0; i < x; i++) {
				a[i] = randNum.nextDouble();
				}
			System.out.println("Array filled.");
			printLoopD(a);
			int y = 0;
			System.out.print("Please enter size of array (greater than 0): ");
			y = kb.nextInt();
			double[] b = new double[y];
			for (int i = 0; i < y; i++) {
				b[i] = randNum.nextDouble();
				}
			System.out.println("Array filled.");
			printLoopD(b);
			System.out.println(methodForQuestion11(a, b));
	}
	
	private static boolean methodForQuestion11(double[] a,double[] b) {
		double sumA = 0, sumB = 0;
		for(int i = 0;i<a.length;i++) {
				sumA += a[i];
			}
		System.out.println("Average of first array: "+ (sumA/a.length));
		for(int i = 0;i<b.length;i++) {
				sumB += b[i];
			}
		System.out.println("Average of second array: "+ (sumB/b.length));
		return (sumA/a.length)>(sumB/b.length);
	}

	private static void question12() {
		System.out.println("Question 12: ");
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			boolean isHotOutside = false;
			double moneyInPocket = 0;
			System.out.print("Is it hot outside? Enter y for yes, or n for no: ");
			String choice = kb.next();
			if(choice.equalsIgnoreCase("y")) {
				isHotOutside = true;
				}
			else {
				isHotOutside = false;
				}
			System.out.print("How much money do you have in your pocket(xx.xx): ");
			moneyInPocket = kb.nextDouble();
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	}
	
	private static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
		boolean a = false;
		if(isHotOutside && moneyInPocket > 10.50) {
			a = true;
			}
		else {
			a = false;
			}
		return a;
	}

	private static void question13() {
		System.out.println("Question 13: ");
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	}
	
	
	
}
