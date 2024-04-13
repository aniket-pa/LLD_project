package Abstract;

public abstract class Programming{

    public  String install_path;
    protected int memory_value;

    public Programming(String path, int memory_value){
        this.install_path = path;
        this.memory_value = memory_value;
    }

    public abstract void print();

    public void displayPath(){
        System.out.println("My path location is"+install_path);
    }


}