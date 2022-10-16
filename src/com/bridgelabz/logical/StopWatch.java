package com.bridgelabz.logical;

import java.util.Scanner;

public class StopWatch {
    static long startTimer = 0;
    static long stopTimer = 0;
    static long elapsed;

    static void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    static void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " + stopTimer);
    }

    static long getElapsedTime() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Press Any key to Start Time: ");
        sc.nextInt();
        start();

        System.out.println();

        System.out.println("Press Any key to Stop Time: ");
        sc.nextInt();
        stop();

        long l = getElapsedTime();
        System.out.println("Total Time Elapsed(in millisec) is:" + l);
        System.out.println("Converting millisec to seconds: " + (l / 1000) + " sec");

    }
}
