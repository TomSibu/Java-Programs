/*******************************************************************************************************
 * File	            :	ThreadSynchronization.java
 * Description      :   Java program that shows thread synchronization
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   6/12/2023
*******************************************************************************************************/

import java.util.*;

public class ThreadSynchronization {

	public static void main(String[] args) {
		Table obj = new Table();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		Thread3 t3 = new Thread3(obj);
		t1.start();
		t2.start();
		t3.start();
	}
}

class Thread3 extends Thread {  
	Table t;
	Thread3(Table t) {  
		this.t = t;  
	}  
	public void run() {  
		t.printTable();  
	}  
}

class Thread2 extends Thread {  
	Table t;  
	Thread2(Table t) {  
		this.t = t;  
	}  
	public void run() {  
		t.printTable();  
	}  
}

class Thread1 extends Thread {  
	Table t;  
	Thread1(Table t) {  
		this.t = t;  
	}  
	public void run() {  
		t.printTable();  
	}  
} 

class Table {  
synchronized void printTable() { 
	Scanner s=new Scanner(System.in);
	int n;
	System.out.print("Enter the value of n: ");
	n=s.nextInt();
 	for(int i=1;i<=10;i++) {  
  		System.out.println(n+" x "+i+" = "+n*i);  
    	try {  
    		Thread.sleep(400);  
   		} catch(Exception e) {	
    		System.out.println(e);}  
 	  	}  
	}
}
