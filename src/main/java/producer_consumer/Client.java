package producer_consumer;

import java.util.concurrent.*;

class  Client{

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Semaphore semaProd = new Semaphore(5);
        Semaphore semaConsum = new Semaphore(0);
        Store s1 =  new Store(5);

        Producer p1 = new Producer(s1,semaProd,semaConsum);
        Consumer c1 = new Consumer(s1,semaProd,semaConsum);

        ExecutorService ec = Executors.newFixedThreadPool(5);


//        for(int i=0 ; i <8; i++){
//            ec.execute(new Producer(s1,semaProd,semaConsum));
//        }
//
//        for(int i=0 ; i <20; i++){
//            ec.execute(new Consumer(s1,semaProd,semaConsum));
//        }

        Future<?> futureProd = ec.submit(p1);
        Future<?> futureConsum = ec.submit(c1);

        futureConsum.get();
        futureProd.get();


        ec.shutdown();
    }

}