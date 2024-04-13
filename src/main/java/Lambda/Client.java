package Lambda;

import producer_consumer.Consumer;

class Client{

    public static void main(String[] args) {

//           SafetyProtocol h1 = (x) ->{
//               System.out.println("Hyndai has "+x+"  air bags");
//           };
//
//           h1.safe(4);
//
//        SafetyProtocol T1 = (x) ->{
//            System.out.println("Tata has "+x+" air bags");
//        };
//
//        T1.safe(6);

        SafetyProtocol tata_veh = (x)->{ System.out.println("tata value is "+x); };

        Thread t1 = new Thread(()->{
            tata_veh.safe(5);
        });
        t1.start();

//        Consumer

//        Thread t2 = new Thread(()->{
//            System.out.println("hello "+Thread.currentThread().getName());
//        });
//        t2.start();

    }
}