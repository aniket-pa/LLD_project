package polymorphism;

class Client{

    public static void main(String[] args) {

        Animal an = new Dog(4,"lab");
        an.walk();

    }
}