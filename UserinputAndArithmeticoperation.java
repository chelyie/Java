package exercise;

import java.util.Scanner;

public class UserinputAndArithmeticoperation {

	public static void main(String[] args) {
		
		int numOne;
		int numTwo;
		int result;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("What is Your Given Number?  ");
		numOne = scanner. nextInt();
		
		System.out.print("What is Your Give Number?  ");
		numTwo = scanner. nextInt();
		
		result = numOne + numTwo;
		
		System.out.println();
		System.out.println(numOne + " + " + numTwo + " = " + result);

	}

}
