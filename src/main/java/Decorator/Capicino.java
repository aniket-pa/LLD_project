
package Decorator;


public class  Capicino extends  Coffee{

    @Override
    public int getCost() {
        return 20;
    }


    @Override
    public void getDesc() {
        System.out.println("This is Capicino coffee");
    }
}