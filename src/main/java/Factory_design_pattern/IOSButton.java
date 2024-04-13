package Factory_design_pattern;

class  IOSButton implements Button{

    @Override
    public void createButton() {
        System.out.println("IOSButton Button created");
    }
}