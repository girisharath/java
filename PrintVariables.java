package test;

public class PrintVariables {

	public static void main(String[] args) {
		// variable declare
		int b;
		boolean value;

		// variable initialization
		b = 10;
		value = true;

		// variable declartion and initialization
		int intNumber = 20;

		// variable utilization
		System.out.println("int value is " + b);
		System.out.println("boolean value is " + value);

		System.out.println("-----------------------------");
		// print without statement
		System.out.println(b);
		System.out.println(value);

		System.out.println("--------------------------");
		System.out.println("DEclared and initialised in single line " + intNumber);
	}

}
