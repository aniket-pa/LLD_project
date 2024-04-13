package PrintNumber;

class PrintNumber implements  Runnable{

    public  Integer number;

    PrintNumber(Integer num){
        this.number = num;
    }

    public void run(){

        System.out.println(this.number+"--- "+Thread.currentThread().getName());
    }

}