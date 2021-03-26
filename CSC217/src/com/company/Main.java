package com.company;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            Thread th1 = new MyThreadManager();
            Thread th2 = new MyThreadManager();
            Thread th3 = new MyThreadManager();
            Thread th4 = new MyThreadManager();
            long serialAnswer = 0;
            long startTime = System.nanoTime();
            for (long i = 1; i <= 2000000000; i++) {
                serialAnswer += i;
            }
            long endTime = System.nanoTime();
            System.out.println(serialAnswer);
            System.out.println(" Time spent is " + (endTime - startTime) + " nanoseconds");
//            ((MyThreadManager) th1).start = 1;
//            ((MyThreadManager) th1).end = 600000000;
//            ((MyThreadManager) th2).start = 600000001;
//            ((MyThreadManager) th2).end = 1200000000;
//            ((MyThreadManager) th3).start = 1200000001;
//            ((MyThreadManager) th3).end = 200000000;
            ((MyThreadManager) th1).start = 1;
            ((MyThreadManager) th1).end = 500000000;
            ((MyThreadManager) th2).start = 500000001;
            ((MyThreadManager) th2).end = 1000000000;
            ((MyThreadManager) th3).start = 1000000001;
            ((MyThreadManager) th3).end = 150000000;
            ((MyThreadManager) th4).start= 1500000001;
            ((MyThreadManager) th4).end = 2000000000;
            startTime = System.nanoTime();
            th1.start();
            th2.start();
            th3.start();
            th4.start();
            // Wait for the Thread to finish
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            long answer = ((MyThreadManager) th1).sum + ((MyThreadManager) th2).sum + ((MyThreadManager) th3).sum + ((MyThreadManager) th4).sum;
            endTime = System.nanoTime();
            System.out.println(answer);
            System.out.println(" Time spent is " + (endTime - startTime) + " nanoseconds");

            Scanner sc=new Scanner(System.in);
            System.out.println("What is x?");
            int userX =sc.nextInt();
            Thread th6 = new MyThreadManager();
            Thread th7 = new MyThreadManagerExpo();
            Thread th8 = new MyThreadManagerFibo();
            ((MyThreadManager) th6).start =1;
            ((MyThreadManager) th6).end = 10000000;
            ((MyThreadManagerExpo) th7).x = userX;
            ((MyThreadManagerFibo) th8).x =userX;
            th6.start();
            th7.start();;
            th8.start();
            th6.join();
            th7.join();
            th8.join();

            answer = userX * ((MyThreadManager) th6).sum + ((MyThreadManagerExpo) th7).result - ((MyThreadManagerFibo) th8).result;
            System.out.println("Sum 1 to 10000000 is " + userX * ((MyThreadManager) th6).sum );
            System.out.println(userX+ " Sum  is " + ((MyThreadManager) th6).sum);
            System.out.println("2 powered by 10x is " + ((MyThreadManagerExpo) th7).result);
            System.out.println("Fibo(x) is " + ((MyThreadManagerFibo) th8).result);
            System.out.println("f(x) = " +answer);

        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
