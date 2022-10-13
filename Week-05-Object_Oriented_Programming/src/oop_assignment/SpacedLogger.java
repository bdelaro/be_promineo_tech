package oop_assignment;

public class SpacedLogger implements Logger {

	public void log(String str) {
		StringBuilder st = new StringBuilder();
		for (char c : str.toCharArray()) {
			st.append(c).append(" ");
		}
		System.out.println(st.toString());
	}

	public void error(String str) {
		StringBuilder st = new StringBuilder();
		System.out.print("Error:");
		for (char c : str.toCharArray()) {
			st.append(c).append(" ");
		}
		System.out.println(st.toString());

	}

}
