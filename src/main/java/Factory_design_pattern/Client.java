package Factory_design_pattern;

class Client{

    public static void main(String[] args) {


        IOS pl =  new IOS();


        LandingPage lp = new LandingPage(pl);


        lp.createDivContainer();
    }
}