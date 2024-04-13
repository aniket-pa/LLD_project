package Thread;

public  class PrintExample implements Runnable{

    int number;
//    String name;
    PrintExample(int number){
        this.number = number;
    }
//    public void display(){
//        System.out.println("displaying");
//    }

    public void run(){
        System.out.println("hello runnable is printed"+number+" "+Thread.currentThread().getName());
    }

}