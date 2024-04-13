package Generices;

import java.util.List;

class  Altroz extends ArchSpec{

    private String variantDetails;
    public List<String> safetyFeatures;
    public Altroz(int no, String type, String archDetails, String variantDetails, List<String> safetyFeatures) {
        super(no, type,archDetails);
        this.variantDetails = variantDetails;
        this.safetyFeatures = safetyFeatures;
    }

    public void details(){
        System.out.println(safetyFeatures);
        System.out.println("Welcome to all new Altroz with the amazing safety features mention and variant "+variantDetails);
    }
}