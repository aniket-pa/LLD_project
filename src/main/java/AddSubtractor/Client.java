package  AddSubtractor;


import java.util.concurrent.*;

class Client{

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        Adder x = new Adder(v);
        Subtractor y = new Subtractor(v);

        FutureTask<Void> futureTaskAdder = new FutureTask<>(x);
        FutureTask<Void> futureTaskSubtract = new FutureTask<>(y);

        Thread t1 = new Thread(futureTaskAdder);
        Thread t2 = new Thread(futureTaskSubtract);

        t1.start();
        t2.start();

        futureTaskAdder.get();
        futureTaskSubtract.get();
//        ExecutorService ec = Executors.newFixedThreadPool(5);
//        ThreadPoolExecutor pool = (ThreadPoolExecutor) ec;
//
//        Future<Void> adderFuture= ec.submit(x);
//        Future<Void> subtractorFuture= ec.submit(y);
//
//        // Wait for both the tasks to get completed
//        adderFuture.get();
//        subtractorFuture.get();

        System.out.println("x value"+v.value);
//
//        ec.shutdown();
    }
}
