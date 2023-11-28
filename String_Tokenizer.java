/************************************************************************************************************
 * File	            :	String_Tokenizer.java
 * Description      :   Write a Java program that reads a line of integers, and then displays each integer, 
 *                      and the sum of all the integers (Use String Tokenizer class of java.util).
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   29/11/23
*************************************************************************************************************/

import java.util.StringTokenizer;
import java.util.Scanner;

public class String_Tokenizer {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String numbers = sc.nextLine();
        StringTokenizer token = new StringTokenizer(numbers);
        int sum=0;

        System.out.println("Individual Integers :");
        while (token.hasMoreTokens()) {
            String token1 = token.nextToken();

            try {
                int number = Integer.parseInt(token1);
                System.out.println(number);
                sum+=number;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }

        System.out.println("Sum of Integers: "+sum);
    }
}
