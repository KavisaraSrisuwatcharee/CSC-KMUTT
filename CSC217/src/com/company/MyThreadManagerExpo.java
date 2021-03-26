package com.company;

public class MyThreadManagerExpo extends Thread{
    int x;
    long result =1;
    public void run(){
        for (int i=1;i<= 10*x ;i++){
            result += 2;
        }
    }
}
