package Lambda;


class Hyundai implements  SafetyProtocol, Runnable{

    public  void safe(int x){
        System.out.println("Hynundai has "+x+" airbags");
    }

    public void  run(){
        System.out.println("runnable method called for Hyundai");
    }


}