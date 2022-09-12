
public class variables {
	
	public static void main(String args[]) {
		
		//variable declaration 
		int a;
		String b;
		boolean c;
		
		//valid declarion of array in java
		int[] s;
		int g[];
		
		//variable initialization
		a=10;
		b="girish";
		c=false;
		
		/* 
		 *  we use + only if we want to use the 
		 *  value of variable with String value in 
		 *  System.out.println 
		 *  ----------------------
		 *  We will not use + ---> concatination operator
		 *  if we only want to print variable value in
		 *  System.out.println  
		 */
		
		//variable utilization
		System.out.println("Integer value is : "+a);
		System.out.println("String value is : "+b);
		System.out.println("Boolean value is : "+c);
	
		
		/*
		 * System.out.println("Integer value is : "+a);
		   System.out.println("String value is : "+b);
		   System.out.println("Boolean value is : "+c); 
		   
		   output
		 * Integer value is : 10
			String value is : girish
			Boolean value is : false
		 * 
		 */
		
		/*
		 * System.out.println("Integer value is : "+a);
		   System.out.print("String value is : "+b);
		   System.out.println("Boolean value is : "+c);
		 * 
		 * output------
		 * Integer value is : 10
			String value is : girishBoolean value is : false
		 * 
		 */
	}	
}
