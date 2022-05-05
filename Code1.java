package com.arithmetic.calculator;
import java.util.*;

 class ArithmeticCalculator {
	
		void operations() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 1st no.: ");
			int num1=sc.nextInt();
			System.out.println("Enter the 2nd no.: ");
			int num2=sc.nextInt();
			
			System.out.println("Please select the operation to be performed\n "
					+ "1. Addition\n"
					+ "2. Subtraction\n"
					+ "3. Multiplication\n"
					+ "4. Division\n"
					+ "5. Exit");
			int n=sc.nextInt();
			
			if(n==1) {
				int sum= num1+num2;
				System.out.println("The result is " + sum);
			}
			else if(n==2) {
				int sub=num1-num2;
				System.out.println("The result is "+ sub);
			}
			else if(n==3) {
				int mul=num1*num2;
				System.out.println("The result is "+ mul);
			}
			else if(n==4) {
				int div=num1/num2;
				System.out.println("The result is "+ div);
				
			}
			else {
				System.exit(0);
			}
		}
	

}

 public class Code1{
	public static void main(String[] args) {
		
	ArithmeticCalculator ac=new ArithmeticCalculator();
	for(;;) {
		ac.operations();
		
	}
	}
	
}