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

import java.util.*;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[n];

        System.out.println("Enter the names:");

        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        quickSort(names, 0, n - 1);

        System.out.println("\nSorted Names (in ascending order):");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }

    private static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
