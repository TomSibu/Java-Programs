/***************************************************************************************************************
 * File	            :	  Multi_Threading.java
 * Description      :   Write a Java program that implements a multithreaded program which has three threads.
 *                      First thread generates a random integer every 1 second. If the value is even, second 
 *                      thread computes the square of the number and prints. If the value is odd the third 
 *                      thread will print the value of cube of the number
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   29/11/23
****************************************************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class Multi_Threading {
    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberGenerator());
        numberThread.start();
    }
}

class NumberGenerator implements Runnable {
    private Random random = new Random();
    private Thread squareThread;
    private Thread cubeThread;

    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the max range of random number: ");
            int n = sc.nextInt();
            for (int i=5;i>0;i--) {
                
                int randomNumber = random.nextInt(n);
                System.out.println("Generated Number: " + randomNumber);

                if (randomNumber % 2 == 0) {
                    Thread squareThread = new Thread(new SquareThread(randomNumber));
                } else {
                    Thread cubeThread = new Thread(new CubeThread(randomNumber));
                }

                Thread.sleep(1000);

                if (squareThread != null && squareThread.isAlive()) {
                    squareThread.join();
                }

                if (cubeThread != null && cubeThread.isAlive()) {
                    cubeThread.join();
                }
                
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class SquareThread implements Runnable {
    private int num;

    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square of " + num + ": " + (num * num));
    }
}

class CubeThread implements Runnable {
    private int num;

    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube of " + num + ": " + (num * num * num));
    }
}
