package test;

public class TESTS {

	public static void main(String[] args) {
		Variables2 v2 = new Variables2();
		v2.test();
		System.out.println("non static variable "+v2.w);
		
		Variables2.s();
		System.out.println("static variable "+Variables2.staticVariable);

	}

}
