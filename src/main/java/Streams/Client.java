package Streams;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class  Client
{
    public static void main(String[] args) {


        List<Integer> l1 = List.of(6,7,9,2,4,1);

        System.out.println(l1);

        Stream<Integer> s1 = l1.stream();

        boolean ans =  s1.allMatch((elem) -> elem % 2 ==0);

//        long count = s1.count();

//        System.out.println("ans"+ans+"count:"+count);

        Stream<Integer> s2 = l1.stream();

          Object[] s3 = s2
                                .filter((element) -> {

//                                    System.out.println("filtering process"+element);
                                    return element % 2 ==0;
                                  }
                                )
                                        .map(elem -> elem *3)
                        .toArray();

        System.out.println(s3[0]);


        List<String> names = List.of("Aniket","Shweta","Sunil","Tejas","Anil");
        List<String> batch = List.of("batch1","batch2","batch3","batch4","batch5");
        List<Integer> student_ids = List.of(1,2,3,4,5);
        List<Integer> psp = List.of(56,23,78,90,50);

//        Integer[] psp = {56,23,78,90,50};

        List<Student> students = new ArrayList<>();

        for(int i =0 ; i < names.size() ; i++){
//            System.out.println(names.get(i));
            students.add(new Student(student_ids.get(i),names.get(i),batch.get(i),psp.get(i)));
        }

        students.stream()
                .filter(ele -> ele.psp > 60)
                .forEach(ele -> System.out.println(ele.name));

    }
}