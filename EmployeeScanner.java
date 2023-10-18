/*******************************************************************************************************************************************
 * File	            :	EmployeeScanner.java
 * Description      :   Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, 
                        Salary. It also has a method named 'print- Salary( )' which prints the salary of the Employee. Two classes 'Officer'
                        and 'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' 
                        and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and a manager 
                        by making an object of both of these classes and print the same.
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   19/10/23
********************************************************************************************************************************************/

import java.util.Scanner;

class Employee {
	String name;
	int age;
	long phonenumber;
	String address;
	long salary;


    void getdetails(Scanner sc) {
	    System.out.println("Enter the name :");
	    name=sc.next();
	    System.out.println("Enter the age :");
	    age=sc.nextInt();
	    System.out.println("Enter the phone number :");
	    phonenumber=sc.nextLong();
	    System.out.println("Enter the address :");
	    address=sc.next();
	    System.out.println("Enter the salary :");
	    salary=sc.nextLong();
    }

    void printdetails() {
	    System.out.println("Name           : "+name);
	    System.out.println("Age            : "+age);
	    System.out.println("PhoneNumber    : "+phonenumber);
	    System.out.println("Address        : "+address);
    }

    void  print_salary() {
	    System.out.println("Salary is      : "+salary);
    }
}

class Officer extends Employee {
    String specilization;
	public void setSpecilization(Scanner sc) {
		System.out.println("Enter the Specilization : ");
    	specilization=sc.next();
    }
	public void printSpecilization() {
		System.out.println("Specilization  : " +specilization);
	}
}

class Manager extends Employee {
	String Department;
	public void setDepartment(Scanner sc) {
		System.out.println("Enter the department");
		Department=sc.next();
	}
	public void printDepartment() {
		System.out.println("Department     : " +Department);
	}
}

public class EmployeeScanner {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Officer officer = new Officer();
		System.out.println("Enter the officer details");
		officer.getdetails(sc);
		officer.setSpecilization(sc);

		System.out.println("Officer Details : ");
		officer.printdetails();
		officer.printSpecilization();
		officer.print_salary();

        Manager manager = new Manager();
		System.out.println("Enter the Manager details ");
		manager.getdetails(sc);
		manager.setDepartment(sc);

		System.out.println("Manager details :");
		manager.printdetails();
		manager.printDepartment();
		manager.print_salary();
	}
}