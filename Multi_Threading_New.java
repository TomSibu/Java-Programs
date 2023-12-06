/**************************************************************************************
 * File	            :	Multi_Threading_New.java
 * Description      :  	Java program that implements a multithreaded program which has
 * 						three threads. First thread generates a random integer every 1
 * 						second. If the value is even, second thread computes the square
 * 						of the number and prints. If the value is odd the third thread
 * 						will print the value of cube of the number
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   6/12/2023
***************************************************************************************/

package Lab8;

import java.util.Random;
class EvenThread extends Thread{
	private int num;
	public EvenThread(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("Square of " + num + "=" + num*num);
	}
}
class OddThread extends Thread{
	private int num;
	public OddThread(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("Cube of " + num + "=" + num*num*num);
	}	
}
class RandomThread extends Thread{
	public void run(){
		Random r = new Random();
		for(int i=0; i<10; i++){
			int num = r.nextInt(100);
			if(num%2 == 0){
				new EvenThread(num).start();
			}
			else{
				new OddThread(num).start();
			}
		}
	}
}
class Multi_Threading_New {
	public static void main(String [] args){
		RandomThread r = new RandomThread();
		r.start();
	}
}
