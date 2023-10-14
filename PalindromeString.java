/**************************************************************************************
 * File	            :	PalindromeString.java
 * Description      :   Program to check whether a string is Palindrome or not.
 * Author           :   Tom SIbu
 * Version          :   1.0
 * Date             :   14/10/23
***************************************************************************************/

import java.util.Scanner;

public class PalindromeString {
    
    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);
        int i,n,j;
        String s = new String();
        String t = new String();
        System.out.println("Enter the String :");
        s = c.nextLine();

        n = s.length();
        t = s;
        s = s.toLowerCase();

        for (i=0,j=n-1;i<j;i++,j--) {

            if (s.charAt(i) != s.charAt(j)) {
                System.out.println(t+" is not a Palindrome.");
                break;
            }

            else {
                System.out.println(t+" is a Palindrome.");
                break;
            }
        }

    }

}
