package JavaProgramming;
import Object_oriented_programming.*;
import Interface.ProgrammingSpecific;


public class JavaProgram implements ProgrammingSpecific  {

    String language;
    int jdk_version;

    public JavaProgram(int version, String language){
        super();
        this.jdk_version=version;
        this.language = language;
    }

    public void display(){
        System.out.println("displaying Java program information");
    }
    public void print(int Number){
        System.out.println("hello");
        System.out.println("hello number"+versions);
    }
    public  void heapStorage(){
        System.out.println("Heap storage value is 3gb");
    }

}