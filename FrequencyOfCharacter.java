/**************************************************************************************
 * File	            :	FrequencyOfCharacter.java
 * Description      :   Program to find the frequency of given character in array.
 * Author           :   Tom SIbu
 * Version          :   1.0
 * Date             :   14/10/23
***************************************************************************************/

import java.util.Scanner;

public class FrequencyOfCharacter {
    
    public static void main(String[] args) {
        int i, count = 0;
        Scanner s = new Scanner(System.in);
        String str = new String();
        String ch = new String();

        System.out.print("Enter the String : ");
        str = s.nextLine();
        str = str.toLowerCase();

        System.out.print("Enter the character : ");
        ch = s.nextLine();
        ch = ch.toLowerCase();

        char str1[] = str.toCharArray();
        char ch1[] = ch.toCharArray();

        for (i=0;i<(str.length()-1);i++) {
            if (str1[i] == ch1[0]) {
                count++;
            }
        }

        System.out.println("THe frequency count of "+ch+" is : "+count);

    }

}
