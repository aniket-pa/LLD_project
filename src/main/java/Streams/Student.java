

package  Streams;


import java.awt.desktop.OpenURIEvent;

class Student implements Display{

      int student_id;
     String name;
     String batch;

     double psp;


    public Student(int id,String name, String batch, double psp)
    {
        this.student_id = id;
        this.name = name;
        this.batch = batch;
        this.psp = psp;
    }


    public void  display(){
        String.format("Name: %s Batch: %s Psp: %s",name,batch,psp);
    }

}