package arrays_methods_assignment;

import java.util.Scanner;

public class Arrays_Methods {

	public static void main(String[] args) {
		boolean run = true, exceptionCatch = true;
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
						System.out.println();
						kb.next();
						System.out.print("Invalid input.\nPick a number 1 - 13, to get corresponding answer to question (Enter zero to exit): ");
					}
				}
				
				if(questionNum >=0 && questionNum <=13) {
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
							System.out.print("Come again!");
							break;
						}
				}
				else {
					System.out.println("Invalid input.");
				}
					System.out.println();
			}
		}
		
	}

	public static void question1() {
		System.out.println("Question 1: ");
//		Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = {3,9,23,64,2,8,28,93}; //length of 8
//		Programmatically subtract the value of the first element in the array from the value in the last 
//		element of the array (i.e. do not use ages[7] in your code). Print the result to the console.	
			System.out.println((ages[ages.length-1])-ages[0]); // should print 90, 93-3
//		Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		Added 50 to the end of the group of ages and added to it a another array
			int[] newAges = {3,9,23,64,2,8,28,93,50}; //length of 9
//		Performed same logic as line 27 with new array that has a different length, to check if it works for arrays of different lengths
			System.out.println((newAges[newAges.length-1])-newAges[0]); // should print 47, 50-3
//		Use a loop to iterate through the array and calculate the average age. Print the result to the console.	
//		Calculating average age of both arrays 
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
//	Changed from void to String array return to use in question5 method
//	Change from void to String[] return type to use in question5 method
	public static String[] question2(){
		System.out.print("Question 2: ");
		
		return null;
	}

	public static void question3() {
		System.out.print("Question 3: ");
	}

	public static void question4() {
		System.out.print("Question 4: ");
	}

	public static void question5() {

	}

	public static void question6() {

	}

	public static void question7() {

	}

	public static void question8() {

	}

	public static void question9() {

	}

	public static void question10() {

	}

	public static void question11() {

	}

	public static void question12() {

	}

	public static void question13() {

	}
	
}
