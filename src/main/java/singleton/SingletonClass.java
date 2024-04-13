package singleton;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

class  SingletonClass implements Callable<Void> {

    private static SingletonClass s1 = null;
    ReentrantLock lock = new ReentrantLock();

    private SingletonClass(){

    }

    public  static SingletonClass getInstance(){

        if (s1 == null)
        {
//            lock.lock();
            if (s1 == null)
            {
                s1 = new SingletonClass();
                System.out.println("print thread name"+Thread.currentThread().getName());
            }
//            lock.unlock();
        }

        return  s1;
    }

    public  Void call(){
        System.out.println("hello");

        return  null;
    }

}