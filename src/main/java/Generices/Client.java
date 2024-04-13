package Generices;

import java.util.ArrayList;
import java.util.List;


class Client{

    public static void main(String[] args) {


        List<ArchSpec> carAlphaList = List.of(
                new ArchSpec(4,"sedan","Alpha"),
                new ArchSpec(4,"hatchBatch","lambda"),
                new ArchSpec(4,"premium hatchBatch","Alpha")
        );

//        List<String> safetyFeatures =  new ArrayList<>()
        List<Altroz> altrozCar = List.of(
                new Altroz(4,"premium hatchBatch","Alpha","XT", List.of("ABD","EBD","4AIRBAGS") ),
                new Altroz(4,"premium hatchBatch","Alpha","XZ+",List.of("ABD","EBD","4AIRBAGS")),
                new Altroz(4,"premium hatchBatch","Alpha","XE",List.of("ABD","EBD","4AIRBAGS"))
        );


        List cars = new ArrayList();
        cars.add("zumo");
        cars.add("tata");


        Car c =  new Car(4,"hello");
        System.out.println(c.getClass());

        Car c2 =  new Altroz(4,"premium hatchBatch","Alpha","XT", List.of("ABD","EBD","4AIRBAGS"));



//        Display.printCarDetails(List.of(new Car(4,"hatchbatch")));
        Display.printCarDetails(carAlphaList);

    }

}