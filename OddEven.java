
package Tom;
import java.util.*;
import java.io.*;
import java.lang.*;

public class EvenOdd {
    public static void main (String[] args) {
        System.out.print("Enter the max number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Object lock=new Object();
        Thread evennum = new Thread(new Even(n,lock));
        Thread oddnum = new Thread(new Odd(n,lock));

        evennum.start();
        oddnum.start();
    }
}

class Even extends Thread {
    private int num;
    public Even (int num) {
        this.num=num;        
    }
    public void run() {
        try {
            for (int i=2;i<=num;i+=2) {
            	printnum pr = new printnum(i);
            }
        } catch (Exception e) {
        // TODO: handle exception
        }
    }
}

class Odd extends Thread {
    private int num;
    public Odd (int num) {
    	this.num=num; 
    }
    public void run() {
        try {
            for (int i=1;i<=num;i+=2) {
                printnum pr = new printnum(i);
            }
        } catch (Exception e) {
        // TODO: handle exception
        }
    }
}

class printnum  {
	private int i;
	
	Synchronized printnum(int i) {
		System.out.println(i);
	}
}
