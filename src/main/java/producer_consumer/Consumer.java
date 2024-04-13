package producer_consumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;

    Semaphore semaProducer;

    Semaphore semaConsumer;

    Consumer(Store st, Semaphore semaProducer, Semaphore semaConsumer){
        this.store = st;
        this.semaConsumer = semaConsumer;
        this.semaProducer =  semaProducer;
    }
    @Override
    public void run() {
        while(true){
//            synchronized (store) {
//                if (store.getItems().size() > 0) {
//                    store.removeItem();
//                }
//            }

            try {
                semaConsumer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            semaProducer.release();


        }
    }
}