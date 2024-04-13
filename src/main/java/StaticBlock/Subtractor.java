package StaticBlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

class Subtractor implements Callable<Void>{

    Value value;

    public Lock lock;
    Subtractor(Value value1,Lock lock){
        this.value = value1;
        this.lock = lock;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Void call() throws Exception {
        lock.lock();
        for(int i=0 ; i<500000000 ; i++){
            this.value.value = this.value.value - i;
        }
        lock.unlock();
        return null;
    }
}