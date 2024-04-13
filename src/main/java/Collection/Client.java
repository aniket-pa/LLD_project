package Collection;

import java.util.*;

enum  exam_status {PASSED,FAILED,PROMOTED};

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };


class Client{

    public static void main(String[] args) {


//        Collecti
        List<Integer> l1 = new ArrayList<>(5);
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(9);
        l1.add(10);
        Integer valN = l1.size();
        System.out.println(l1.get(1));

        List<Integer> l2 = new ArrayList<>(5);


        List<Integer> link1 = new LinkedList<>();
        link1.add(1);
        link1.add(3);
        link1.add(4);
        link1.add(6);
        link1.add(9);
        link1.add(10);
        System.out.println(link1.stream().max( (x,y)-> y-x ));
        System.out.println(link1.hashCode());


        System.out.println(l1);
        System.out.println(link1);

        List<Integer> vec1 = new Vector<>();

//        Set<String> names = new HashSet<>();
//        names.add("Aniket");
//        names.add("Shweta");
//        names.add("Tejas");
//        names.add("Anil");

        Set<String> cities = new LinkedHashSet<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Kolhapur");
        cities.add("Nashik");

        System.out.println(cities);

        EnumSet<exam_status> set1 = EnumSet.of(exam_status.PASSED);
        Set<exam_status> student_status =  EnumSet.complementOf( set1);

        System.out.println("student exam status"+student_status);

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(10);
        q1.add(1);
        q1.add(7);
        q1.add(2);
        q1.add(8);
        q1.add(0);

        System.out.println("Priority queue"+q1);
        System.out.println("peek element "+q1);

        Queue<Integer> arrayQueue = new ArrayDeque<>();
        arrayQueue.add(10);
        arrayQueue.add(1);
        arrayQueue.add(7);
        arrayQueue.add(9);
        arrayQueue.add(0);

        System.out.println("array queue"+arrayQueue);



        List<Integer> lis3 = new ArrayList<>();
        lis3.add(10);
        lis3.add(35);
        lis3.add(4);
        lis3.add(2);
        lis3.add(19);
        lis3.add(78);
        lis3.add(27);
        lis3.add(0);
//                List.of(10,35,4,2,19,78,27,0);

        Collections.sort(lis3, (x,y)-> y-x );

        System.out.println(lis3);


        List<String> namesList = List.of("Aniket","Shweta","Sunil","Tejas","Anil");
        List<String> batch = List.of("batch1","batch2","batch3","batch4","batch5");
        List<Integer> student_ids = List.of(1,2,3,4,5);
        List<Integer> psp = List.of(56,23,78,90,50);

//        Integer[] psp = {56,23,78,90,50};

        List<Student> studentArrayList = new ArrayList<>();

        for(int i =0 ; i < namesList.size() ; i++){
            studentArrayList.add(new Student(student_ids.get(i),namesList.get(i),batch.get(i),psp.get(i)));
        }


        Collections.sort(studentArrayList);

        for (Student s1 : studentArrayList) {
            System.out.print(""+s1.name);
        }

//        Collections.sort(studentArrayList,(Student s1, Student s2)-> s2.psp - s1.psp);




        Collections.addAll(studentArrayList,new Student(6,"Sahil","batch6",89));

        System.out.println( "ans value"+
                    Collections.binarySearch( studentArrayList , new Student("Aniket") ,
                            (Student x , Student y) -> Objects.equals(x.name, y.name) ? 1 : 0
                            )
                );

        System.out.println( "ans value"+
                Collections.binarySearch( studentArrayList , new Student("Aniket") )
        );

        for (Student s1 : studentArrayList) {
            System.out.println(" "+s1.name+"student id"+s1.student_id);
        }

        //Arrays

        int[] cars24 = new int[3];
        cars24[0] = 23;
        cars24[1] = 24;
        cars24[2] = 25;
//        cars24[3] = 26;

        System.out.println(Arrays.toString(cars24));


    }
}