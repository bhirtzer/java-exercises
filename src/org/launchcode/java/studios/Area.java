package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = in.nextDouble();

        if (radius < 0) {
            System.out.println("You can't use a negative number!");
            System.exit(0);
        }

        area = (Math.PI * radius * radius);

        System.out.println("The area of the circle with a radius of " + radius + " is: " + area);
    }
}
