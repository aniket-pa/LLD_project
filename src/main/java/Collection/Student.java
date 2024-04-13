package Collection;

class Student  implements  Comparable<Student>{

    int student_id;
    String name;
    String batch;

    double psp;

    public  Student(String name)
    {
        this.name=name;
    }

    public Student(int id,String name, String batch, double psp)
    {
        this.student_id = id;
        this.name = name;
        this.batch = batch;
        this.psp = psp;
    }


    public  int  compareTo(Student s1)
    {
        if (s1.student_id > this.student_id )
        {
            return  -1;
        } else if (s1.student_id < this.student_id) {
            return 1;
        }
        else {
            return 0;
        }

    }

    public void  display(){
        String.format("Name: %s Batch: %s Psp: %s",name,batch,psp);
    }

}