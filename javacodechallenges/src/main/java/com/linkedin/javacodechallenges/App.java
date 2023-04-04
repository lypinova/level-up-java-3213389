package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double minBill = 18.84;
        double ccf = 748; 
        double minGallons = 2*ccf; 

        if (gallonsUsage <= minGallons) { 
            return minBill;
        } else {
            double additGallon = gallonsUsage - minGallons; 
            double extraFee = Math.ceil(additGallon/ccf)*3.9;
            return minBill+extraFee; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
