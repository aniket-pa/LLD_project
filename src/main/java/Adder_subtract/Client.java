package Adder_subtract;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class  Client{

    public static void main(String[] args)  throws ExecutionException, InterruptedException  {

//        Lock lock = new ReentrantLock();

        Value v1 = new Value();
        Adder a1 = new Adder(v1);
        Subtract s1 = new Subtract(v1);


        ExecutorService ec = Executors.newCachedThreadPool();
        Future<Void> FutureAddVal = ec.submit(a1);
        Future<Void> FutureSubVal =  ec.submit(s1);

        FutureAddVal.get();
        FutureSubVal.get();

        System.out.println("Value: "+v1.value);

        ec.shutdown();


    }
}