package com.bridgelabz.logical;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        int count = 1;


        while (count <= num){
            System.out.print(z+" ");
            z = x + y;
            y = x;
            x = z;
            count++;
        }
    }
}
