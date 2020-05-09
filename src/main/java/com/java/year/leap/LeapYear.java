package com.java.year.leap;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){

        System.out.print("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        testLeapYear(year);

    }

    public static Boolean testLeapYear(int year){
        if (year % 400 == 0){
            System.out.println(year+ " is a leap year");
            return true;
        }

        else if(year % 100 == 0 && year % 400 != 0){
            System.out.println(year+ " is not a leap year");
            return false;
        }

        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+ " is a leap year");
            return true;
        }

        else if(year % 4 != 0 ){
            System.out.println(year+ " is not a leap year");
            return false;
        }

        return false;
    }

}
