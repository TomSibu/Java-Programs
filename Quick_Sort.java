/**********************************************************************************************
 * File	            :	Quick_Sort.java
 * Description      :  	Java program that implements Quick sort algorithm for sorting a list 
 * 						of names in ascending order
 * Author           :   Tom Sibu
 * Date             :   6/12/2023
 * System No		:	32
 * Class			:	S3 CSE B
 * Roll No			:	63
***********************************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Quick_Sort {
    	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter the number of names: ");
        	int n = scanner.nextInt();
        	scanner.nextLine();

        	ArrayList<String> names = new ArrayList<>();
        	System.out.println("Enter the names:");
        	for (int i = 0; i < n; i++) {
           	System.out.print("Name " + (i + 1) + ": ");
            	names.add(scanner.nextLine());
        	}

        	quickSort(names, 0, n - 1);
        	System.out.println("\nSorted Names (in ascending order):");
        	for (String name : names) {
            	System.out.println(name);
        		}
    	}

    	private static void quickSort(ArrayList<String> arr, int low, int high) {
        		if (low < high) {
            		int partitionIndex = partition(arr, low, high);
            		quickSort(arr, low, partitionIndex - 1);
            		quickSort(arr, partitionIndex + 1, high);
        		}
    	}

    	private static int partition(ArrayList<String> arr, int low, int high) {
        		String pivot = arr.get(high);
        		int i = low - 1;

        		for (int j = low; j < high; j++) {
            		if (arr.get(j).compareTo(pivot) < 0) {
                			i++;
                			String temp = arr.get(i);
                			arr.set(i, arr.get(j));
                			arr.set(j, temp);
            		}
        		}
        		String temp = arr.get(i + 1);
        		arr.set(i + 1, arr.get(high));
        		arr.set(high, temp);
        		return i + 1;
    	}
}
