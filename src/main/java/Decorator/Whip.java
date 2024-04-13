

package Decorator;


class  Whip extends  Addons{

    Coffee c1;

    Whip(Coffee c2){
        this.c1= c2;
    }

    @Override
    public void getDesc() {
        c1.getDesc();
        System.out.println("Whip is added");
    }

    @Override
    public int getCost() {
        return 60 + c1.getCost() ;
    }
}