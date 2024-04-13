package producer_consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

//    private List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
//        this.items = new ArrayList<>();
        this.items = new ConcurrentLinkedDeque<Object>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }
//    public List<Object> getItems() {
//        return items;
//    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
//        System.out.println("Producer produced time, current size " + this.items.size());
    }

    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
//        System.out.println("Consumer item, current size " + this.items.size());
    }
}