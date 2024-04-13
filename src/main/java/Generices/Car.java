package Generices;

class Car{

    private int number_tyres;
    private String car_type;

    protected String engine_variant;

    public Car(int no, String type)
    {
        this.car_type = type;
        this.number_tyres = no;
    }

    public int getNumberTyres(){
        return number_tyres;
    }
    public void vehicleInfo(Car car){
        System.out.println("Car is of type "+car_type+" with number of tyre"+number_tyres);


        System.out.println("Number of tyres"+car.getNumberTyres());
//        System.out.println(car.engine_variant);

    }


}