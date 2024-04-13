package shallow_deep_copy;

public class Student{

    int age;
    String name;

    Student(int age, String name)
    {
        this.age = age;
        this.name= name;
    }

    Student(Student S)
    {
        this.age = S.age;
        this.name= S.name;
    }


}