

package  Decorator;


class  Client{

    public static void main(String[] args) {


        Coffee h1 = new HouseMade();

        h1 = new Milk(h1);
        h1 = new Whip(h1);
        h1 = new Milk(h1);


        h1.getDesc();

        System.out.println(h1.getCost());

    }
}