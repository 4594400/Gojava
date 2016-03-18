package com.goit.module_6.exampleMyException;


import java.util.Scanner;

public class RunMyException {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 1:");
        Double number = scanner.nextDouble();
        if (number<0 || number>1) {
            try {
                throw new MyException(number.toString());
            } catch (MyException e) {
                System.out.println("You have entered " + e.getName() + ", but number should be >= 0 and <= 1");
            }
        } else {
            System.out.println("Everythink ok! You enter:" + number);
        }
    }
}
