package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(1+2);

        int length = 5;
        int width = 3;

        System.out.println("Rectangle area: " + length * width);

        double radius = 5;

        System.out.println("Circle diameter: " + 2 * radius);
        System.out.println("Circle area: " + radius * radius * 3.14);
        System.out.println("Circle circumference: " + 2 * radius * 3.14);


        // Print remaining angle of a triangle
        int angleA = 80;
        int angleB = 65;
        System.out.println("angleC = " + (180 - angleA - angleB));

        // Print difference between dates
        LocalDate date1 = LocalDate.of(2024, 3, 19);
        LocalDate date2 = LocalDate.of(2024, 3, 21);
        System.out.println(ChronoUnit.DAYS.between(date1, date2));

        // Initials
        String firstName = "John";
        String lastName = "Doe";
        String initials = firstName.substring(0, 1) + lastName.substring(0, 1);
        System.out.println(initials);
    }
}