//Program to convert an Octal number to its Binary number counterpart.
//Author : Tom Sibu

import java.util.Scanner;

public class Octal_to_Binary {
 public static void main(String[] args) {
     int x,i=0,j,len=0,n;
     Scanner s = new Scanner(System.in);
     x = readOctal(s);                                                    // Reading the Octal number
     String b[] = {"000","001","010","011","100","101","110","111"};
          
     len = getlength(x, len);                                             // Getting no of digits of number
     
     int c[] = new int[len];

     i = sepDigits(x, i, c);                                              // Turning the number to array for indexing

     result(i, b, c);                                                     // Printing the output
 }

private static int readOctal(Scanner s) {
    int x;
    System.out.println("Enter the Octal number : ");
     x = s.nextInt();
    return x;
}

private static void result(int i, String[] b, int[] c) {
    int j;
    int n;
    System.out.print("Binary Equivalent : ");
     for (j=i-1;j>=0;j--) {
         n = c[j];
         System.out.print(" "+b[n]);
     }
}

private static int sepDigits(int x, int i, int[] c) {
    while (x!=0) {
         int rem = x%10;
         c[i] = rem;
         i++;
         x = x/10;
     }
    return i;
}

private static int getlength(int x, int len) {
    int x1 =x;
     while (x1!=0) {
         x1 = x1/10;
         len++;
     }
    return len;
}
}

