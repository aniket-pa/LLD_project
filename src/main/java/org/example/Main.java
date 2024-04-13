package org.example;
import Abstract.Programming;
import Interface.ProgrammingSpecific;
import JavaProgramming.*;
import Object_oriented_programming.Object_orinted;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        JavaProgram jv = new JavaProgram(21,"jdk","/home/java/jdk",500);
        JavaProgram jv = new JavaProgram(21,"jdk");

        System.out.println("hello number"+jv.versions);

//        Object_orinted obv = new Object_orinted();

//        System.out.println("kav");

        jv.print(34);
//        jv.pillars();
//        jv.displayPath();

//        jv.heapStorage();

//
//        List<Object_orinted> lst = new ArrayList<Object_orinted>();
//        lst.add(jv);
//        lst.add(obv);

//        for(Object_orinted lst_val :lst){
////            System.out.println();
//            lst_val.print();
//        }
    }
}