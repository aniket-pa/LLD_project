

package Decorator;


class  Latte extends  Addons{

    Coffee c1;

    Latte(Coffee c2){
        this.c1= c2;
    }

    @Override
    public void getDesc() {
        c1.getDesc();
        System.out.println("Latte is added");
    }

    @Override
    public int getCost() {
        return 50 + c1.getCost() ;
    }
}