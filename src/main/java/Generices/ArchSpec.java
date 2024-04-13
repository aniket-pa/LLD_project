
package Generices;

class  ArchSpec extends Tata{

    private String architecturalDetails;
    public ArchSpec(int no, String type,String archDetails) {
        super(no, type);
        this.architecturalDetails = archDetails;
    }

    public void platform(){
        System.out.println("It is build on its own R&D");
    }
}