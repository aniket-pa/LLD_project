package GenericsTest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Client{

    public static void main(String[] args) {


//      int count =  Animal.details(23);
//
//      System.out.println("count: "+count);
//
//      Animal<String,Integer> a1 = new Animal<>("Aniket",34);
//
//      a1.display("Bhandup west");
//
//
//        List<Integer>  integerList =   new ArrayList<>(2);
//
//        integerList.add(34);
//        integerList.add(43);
//        integerList.add(45);
//        integerList.add(44);
//
//        System.out.println(integerList);
//        int size = integerList.size();
//        System.out.println(integerList+" "+size);
//
//       Set<Integer> s2 =  new TreeSet<>();
//       s2.add(78);
//       s2.add(23);
//       s2.add(45);
//       s2.add(1);
//
//       System.out.println(s2);
//
//
//        Queue<String> q = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        q.add("Mohit");
//        q.add("Abhinav");
//        q.add("Rohit");
//        q.add("Mayank");
//        q.add("Raj");
//
//        System.out.println(q);

        List<Integer> l1 = List.of(2,3,4,5,6);
        System.out.println(l1);

        Stream<Integer> s = l1.stream();
        System.out.println(s);

        Integer finalList = s
                                    .limit(4)
                                    .map( x -> x*2 )
                .reduce(0, (curr_sum, elem) ->  curr_sum + elem );


//                .collect(Collectors.toList());

        System.out.println(finalList);
//        System.out.println(s.limit(4).sorted().collect(Collectors.toList()));


    }
}