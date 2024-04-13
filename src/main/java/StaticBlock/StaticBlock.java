package StaticBlock;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Class 1
// Helper class
abstract class Test {

    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;

    String name;

    Test(String nm){
        this();
        this.name = nm;
        System.out.println("parameterised called");
    }


    Test(){
        System.out.println("default called");
    }

    abstract void detail();

}

// Class 2
// Main class
class GFG extends  Test {

    // Main driver method
    GFG(String name){
        super(name);
        System.out.println("GFG constructor called");
    }

    @Override
    void detail() {
        System.out.println("hello");
    }
}


class Client{
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Although we have two objects, static block is
        // executed only once.
//       Test t1 = new Test();
//        Test t2 = new Test();

//         Test t1 = new GFG("Aniket");
//
//         t1.detail();
//
//         System.out.println(Test.i);

        Value v1 = new Value();
        Lock lock = new ReentrantLock();

//        System.out.println(v1.value);


        Adder a1 = new Adder(v1,lock);
        Subtractor sb1 = new Subtractor(v1,lock);

//        Future<Void> futureAdd =  new Future<>(a1);
//        Future<Void> futureSub =  new Future<>(sb1);

        ExecutorService ec = Executors.newCachedThreadPool();
        Future<Void> futureAdd =  ec.submit(a1);
        Future<Void> futureSub =  ec.submit(sb1);

        futureAdd.get();
        futureSub.get();



//        FutureTask<Integer> futureAdd =  new FutureTask<>(a1);
//        FutureTask<Integer> futureSub =  new FutureTask<>(sb1);
//
//        Thread futureT1 = new Thread(futureAdd);
//        Thread futureT2 = new Thread(futureSub);
//
//        futureT1.start();
//        futureT2.start();
//
//        futureAdd.get();
//        futureSub.get();

//        ExecutorService ec = Executors.newFixedThreadPool(5);
//
//        Future<Integer> futureAdd = ec.submit(a1);
//        Future<Integer> futureSub = ec.submit(sb1);
//
//        futureAdd.get();
//        futureSub.get();
//
//
        System.out.println("final value "+ v1.value);


//        ec.shutdown();




    }
}