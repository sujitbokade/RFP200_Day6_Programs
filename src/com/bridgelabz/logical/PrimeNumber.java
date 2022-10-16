package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("It is Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
