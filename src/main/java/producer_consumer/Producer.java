package producer_consumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    Semaphore semaProducer;

    Semaphore semaConsumer;
    Producer(Store st, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = st;
        this.semaProducer = semaProducer;
        this.semaConsumer =  semaConsumer;
    }
    @Override
    public void run() {
        while(true){

//            synchronized (store) {
//                if (store.getItems().size() < store.getMaxSize()) {
////                    System.out.println("Cleared production check");
//                    store.addItem();
//                }
//            }

            try {
                semaProducer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
                semaConsumer.release();


        }
    }
}