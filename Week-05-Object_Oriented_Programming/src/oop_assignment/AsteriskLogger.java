package oop_assignment;

public class AsteriskLogger implements Logger {

	public void log(String str) {
		System.out.println("***" + str + "***");
	}

	public void error(String str1) {
		for (int i = 0; i < 12 + str1.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n***" + "Error:" + str1 + "***");
		for (int i = 0; i < 12 + str1.length(); i++) {
			System.out.print("*");
		}

	}
}
