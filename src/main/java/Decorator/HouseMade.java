
package Decorator;


public class  HouseMade extends  Coffee{

//    int houseMadeCost = 10;
    @Override
    public int getCost() {
        return 10;
    }


    @Override
    public void getDesc() {
        System.out.println("This is HouseMade coffee");
    }



}