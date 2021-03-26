package com.company;

public class MyThreadManagerFibo extends Thread{
    int x;
    long result = 0 ;
    public void run() {
        if(x==0 || x==1){
            result = x;
        }else{
            long prev2=0, prev1=1;
            //fib(x) = fib(x-1) + fib(x-2)
            for(int i=2;i<=x;i++){
                result = prev2 +prev1;
                prev2 =prev1;
                prev1 = result;
            }
        }
    }
}
