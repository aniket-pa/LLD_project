package Adder_subtract;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;


public class  Adder implements Callable<Void> {

    Value v1;
    Lock lock;

    Adder(Value v2 ){
            this.v1 = v2;
//            this.lock = lock;
    }

    public Void call(){

        for(int i = 0; i< 50000000 ; i++)
        {

//            lock.lock();
            v1.value = v1.value +1;
//            lock.unlock();
        }
        return null;
    }

}