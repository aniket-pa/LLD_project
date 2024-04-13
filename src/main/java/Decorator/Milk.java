

package Decorator;


class  Milk extends  Addons{

    Coffee c1;

    Milk(Coffee c2){
        this.c1= c2;
    }

    @Override
    public void getDesc() {
        c1.getDesc();
        System.out.println("Milk is added");
    }

    @Override
    public int getCost() {
        return 10 + c1.getCost() ;
    }
}