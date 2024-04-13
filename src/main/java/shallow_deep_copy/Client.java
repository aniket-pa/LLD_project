package shallow_deep_copy;

class  Client{

    public static void main(String[] args) {

        Student s1 = new Student(29,"Aniket");

        Student s2 = new Student(s1);

        s2.name = "Santosh";

        System.out.println("details"+s2.name);
        System.out.println("details"+s1.name);

    }
}