package com.bridgelabz.junit;

import java.util.Scanner;

public class TempConversion {
    static void temperatureConversion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Press (f) to covert from fahrenheit to Celsius :");
        System.out.println("2.Press (c) to convert from Celsius to fahrenheit :");
        char ch = sc.next().charAt(0);

        if (ch == 'f') {
            System.out.println("Enter temperature to convert from fahrenheit to Celsius");
            double f = sc.nextInt();
            double c = (f - 32) * 5 / 9;
            System.out.println(f + " degree fahrenheit is " + c + " degree Celsius");
        } else if (ch == 'c') {
            System.out.println("Enter temperature to convert from Celsius to fahrenheit");
            double c = sc.nextInt();
            double f = (c * 9 / 5) + 32;
            System.out.println(c + " degree  Celsius  is " + f + " degree fahrenheit");
        }
    }

    public static void main(String[] args) {
        temperatureConversion();
    }
}
