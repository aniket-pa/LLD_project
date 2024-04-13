package Thread;

import java.util.Scanner;

//class ThreadTest {
//
//    RunnableThread threadInst;
//
//    public ThreadTest(RunnableThread tr)
//    {
//        this.threadInst = tr;
//    }
//
//    public void start(){
//
//        threadInst.run();
//    }
//
//}

class Client{

    public static void main(String[] args) {



//        int number1;
//        int number2;
//        Scanner scan1 = new Scanner(System.in);
//        number1 = scan1.nextInt();
//        number2 = scan1.nextInt();

//        System.out.println("numbers"+number1+number2);
        for(int i=0; i< 1000000; i++)
        {
//            PrintExample pr =  new PrintExample(i);
            int finalI = i;
            Thread t1 = new Thread(()->{
                System.out.println("Hello runnable is printed "+ finalI +" "+Thread.currentThread().getName());
            });
            
            t1.start();
        }

//        Thread t1 = new Thread(pr);
//        t1.start();
    }

}