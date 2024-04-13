package Object_oriented_programming;
import Abstract.*;
import Interface.ProgrammingSpecific;

//extends Programming implements ProgrammingSpecific
public  class Object_orinted{

    int numbers_language;

    public Object_orinted(int numbers_language){
        this.numbers_language=numbers_language;
    }

    public Object_orinted(){
        this.numbers_language=0;
    }
//    public abstract void print();

    public void pillars(){
        System.out.println("Four pillars it has.");
        System.out.println("memory value");
    }

    public void display(){
        System.out.println("displaying Object oriented program information");
    }
    public void print(){
        System.out.println("hello");
    }
    public  void heapStorage(){
        System.out.println("Heap storage value is 3gb");
    }

}