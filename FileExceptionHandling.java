/************************************************************************************************************
 * File	            :	FileExceptionHandling.java
 * Description      :   Java program that reads from a file and writes to file by handling all file related 
 * 						exceptions
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   29/11/23
*************************************************************************************************************/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExceptionHandling {

	public static void main(String[] args) {
		char[] data = new char[100];
		FileReader read = null;
		FileWriter write = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			read = new FileReader("/home/cseb2/Documents/testfile.txt");
			read.read(data);
			System.out.println(data);
			String data1 = new String();
			System.out.println("Enter the data to be entered to file :");
			data1=sc.nextLine();
			write = new FileWriter("/home/cseb2/Documents/testfile.txt");
			write.write(data1);
			System.out.println("Data entered.");
			write.close();
			
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (read != null) {
                    read.close();
                }
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
