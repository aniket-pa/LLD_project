package polymorphism;

class Dog extends Animal{

    int legs;
    String type;
    Dog(int legs,String type){
        this.legs = legs;
        this.type = type;
    }

    public void bark(){
        System.out.println("hello");
    }

    public void walk(){
        System.out.println("Walk implementation with "+legs);
    }

}