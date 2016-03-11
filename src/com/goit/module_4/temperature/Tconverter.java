package com.goit.module_4.temperature;

import java.util.Scanner;

public class Tconverter {

    public static void main(String[] args) {
        System.out.println("If you want to convert temperature from Celsius to Fahrenheit, press 1:");
        System.out.println("If you want to convert temperature from Fahrenheit to Celsius press 2:");

        try {


        Scanner inn1 = new Scanner(System.in);
        int choice = inn1.nextInt();

        if (choice==1) {
            System.out.println("Enter temperature:");
            Scanner inn2 = new Scanner(System.in);
            double temp = inn2.nextDouble();
            System.out.println(temp+ " degrees Celsius = " + celsiusToFarengate(temp) + " degrees Fahrenheit");
        }
        else if (choice==2){
            System.out.println("Enter temperature:");
            Scanner inn3 = new Scanner(System.in);
            double temp = inn3.nextDouble();
            System.out.println(temp+ " degrees Fahrenheit = " + farengateToCelsius(temp)+ " degrees Celsius");
        }
        else System.out.println("Incorrect choice");
        } catch (Exception e) {
            System.out.println("incorrect choice");
        }
    }

    public static double celsiusToFarengate(double cel) {

        return (cel * 1.8) + 32;
    }

    public static double farengateToCelsius(double far) {
        return (far - 32) / 1.8;
    }


}

