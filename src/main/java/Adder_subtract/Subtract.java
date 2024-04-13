package Adder_subtract;

import Adder_subtract.Value;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class  Subtract implements Callable<Void> {

    Value v1;
    Lock lock;


    public Subtract(Value v1) {
        this.v1 = v1;
//        this.lock=lock;
    }

    public Void call(){

        for(int i = 0; i< 50000000 ; i++)
        {
//            System.out.println("Thread"+Thread.currentThread().getName());
//            if (i == 100)
//            {
//                System.out.println("stop");
//            }
//            lock.lock();
            v1.value = v1.value -1;
//            lock.unlock();
        }
        return null;
    }

}