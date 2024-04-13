
package Decorator;


public class  Espresso extends  Coffee{

    @Override
    public int getCost() {
        return 40;
    }


    @Override
    public void getDesc() {
        System.out.println("This is Espresso coffee");
    }
}