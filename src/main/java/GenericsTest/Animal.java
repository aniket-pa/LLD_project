package GenericsTest;

class Animal<A,V>{

    public A name;
    V age;

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    Animal(){}

    Animal(A nam1, V age1){
        this.name= nam1;
        this.age = age1;
    }


    public <H> void display(H address){
        System.out.println(this.age+" "+this.name+" "+address);
    }
    public static <T> int details(T name){

        System.out.println("Hello people");

        return 23;

    }
}