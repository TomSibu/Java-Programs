/*******************************************************************************************************************************************
 * File	            :	Super_Overriding_DemoEmployee.java
 * Description      :   **Usage of Super and Overriding** - Write two Java classes Employee and Engineer. Engineer should inherit from 
                        Employee class. Employee class to have two methods display() and calcSalary(). Write a program to display the 
                        engineer salary and to display from Employee class using a single object instantiation (i.e., only one object 
                        creation is allowed). 
                        ● display() only prints the name of the class and does not return any value. Ex. “....... Employee.......”
                        ● calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in Engineer displays “Salary of
                          Engineer is 20000.”
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   19/10/23
********************************************************************************************************************************************/

import java.util.Scanner;

class Employee {
    void display() {
        System.out.println(".......Employee.......");
    }
    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    void calcSalary() {
        super.calcSalary();
        System.out.println("Salary of Engineer is 20000");
    }
}

public class Super_Overriding_DemoEmployee {
    public static void main(String[] args) {
        Employee emp = new Engineer();
        emp.display();
        emp.calcSalary();
    }
}