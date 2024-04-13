package Generices;

import java.util.List;

class Display{


    public static <T extends Car>  void printCarDetails(List<T> cars){

        
        for(T c : cars){
            c.vehicleInfo(c);
//            System.out.println();
        }

    }
}