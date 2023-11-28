/*******************************************************************************************************************************************
 * File	            :	Exception_Handling.java
 * Description      :   Write a menu-driven Java Program that shows the usage of the following BuitinException
 * 			using try, catch, throws and finally.
 * 				1. ArithmeticException
 *				2. ArrayIndexOutOfBoundException
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   29/11/23
********************************************************************************************************************************************/

import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Choose an option:");
			System.out.println("1. ArithmeticException");
			System.out.println("2. ArrayIndexOutOfBoundsException");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					ArithmeticOperation();
					break;
				case 2:
					ArrayOperation();
					break;
				case 3:
					System.out.println("Exiting program.");
					break;
				default :
					System.out.println("Invalid choice.");
			}
		} while (choice != 3);
	}

	private static void ArrayOperation() throws ArrayIndexOutOfBoundsException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the max size of array: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.print("Enter the array elements: ");
			for (int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("Enter the index number : ");
			int index = sc.nextInt();
			System.out.println("Value = "+arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println(e);
			
		} finally {
			System.out.println("This block will always execute.");
		}
		
	}

	private static void ArithmeticOperation() throws ArithmeticException{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter first number: ");
			int a = sc.nextInt();
			System.out.print("Enter second number: ");
			int b = sc.nextInt();
			System.out.println("Result: "+ a/b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("This block will always execute.");
		}
		
	}

}
