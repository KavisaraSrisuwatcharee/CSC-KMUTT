package com.company;

public class MyThreadManager extends Thread {
    long start,end;
    long sum = 0;

    @Override
    public void run() {
        for (long i=start; i<=end; i++) {
            sum += i;
        }
    }

}