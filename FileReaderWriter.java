/************************************************************************************************************
 * File	            :	FileReaderWriter.java
 * Description      :   Write a file handling program in Java with reader/writer. 
 *						Create a file sample.txt and store the inputs given from the keyboard. After 
 * 						execution of program a new file is generated with name "new-sample.txt" with the 
 * 						contents from sample.txt.
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   29/11/2023
*************************************************************************************************************/

import java.io.*;
import java.util.Scanner;

public class FileReaderWriter {
	public static void main(String[] args) {
		
		System.out.println("Enter data: ");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		FileWriter out;
		FileReader read1;
		try {
			out = new FileWriter("sample.txt");
			out.write(data);
			out.flush();
			System.out.println("Data saved to sample.txt");
			read1 = new FileReader("sample.txt");
			out = new FileWriter("new-sample.txt");
			int n=read1.read();
			while (n!=-1) {
				out.write(n);
				n=read1.read();
			}
			System.out.println("Data copied from sample.txt to new-sample.txt successfully.");
			out.close();
			read1.close();
		} catch (FileNotFoundException f) {
			System.out.println(f);
		} catch(IOException e) {
			System.out.println(e);
		} 
	
	}
}
