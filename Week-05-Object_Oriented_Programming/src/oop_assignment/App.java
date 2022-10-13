package oop_assignment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int run = 0;
		AsteriskLogger myLog = new AsteriskLogger();
		SpacedLogger mylog = new SpacedLogger();

		try (Scanner kb = new Scanner(System.in)) {
			while (run < 5) {
				System.out.print("Please enter a word of your choice: ");
				String str = kb.next();

				System.out.println();

				myLog.log(str);
				System.out.println();
				myLog.error(str);

				System.out.println();
				for (int i = 0; i < 25; i++) {
					System.out.print("-");
				}
				System.out.println();

				mylog.log(str);
				System.out.println();
				mylog.error(str);

				System.out.println();

				run++;
			}
		}
	}

}
