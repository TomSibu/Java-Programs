/*******************************************************************************************************************************************
 * File	            :	ShapesAbstract.java
 * Description      :   Java program to create an abstract class named Shape that contains an empty method named numberOfSides(). Provide
                        three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. Each
                        one of the classes contains only the method numberOfSides() that shows the number of sides in the given geometrical
                        structures. Also find the sumofAngles() of each shape when the side is given.
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   19/10/23
********************************************************************************************************************************************/

import java.util.Scanner;

abstract class Shape {
    abstract void numberOfSides();

    void sumofAngles(int n) {
        System.out.println("Sum of angles             : "+((n-2)*180));
    }
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("No. of sides of rectangle : 4");
        sumofAngles(4);
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("No. of sides of triangle  : 3");
        sumofAngles(3);
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("No. of sides of hexagon   : 6");
        sumofAngles(6);
    }
}

public class ShapesAbstract {
    public static void main(String[] args) {
        
        Rectangle a = new Rectangle();
        Triangle b = new Triangle();
        Hexagon c = new Hexagon();

        a.numberOfSides();
        b.numberOfSides();
        c.numberOfSides();
    }
  
}
