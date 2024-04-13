package Factory_design_pattern;

class  AndroidButton implements Button{

    @Override
    public void createButton() {
        System.out.println("Android Button created");
    }
}