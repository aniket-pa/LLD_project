package Factory_design_pattern;

class  LandingPage{

    Platform pl;

    LandingPage(Platform pl){
        this.pl = pl;
    }



    public void createDivContainer(){

          UIcomponentFactoryDB uiComponentFactory = pl.createUIComponentFactory();
          Button button =  uiComponentFactory.createButton();

          button.createButton();


//        Button b1 = null ;
//
//        if(pl instanceof Android){
//            b1 = new AndroidButton();
//        }
//        if(pl instanceof IOS){
//            b1 = new IOSButton();
//        }



//        b1.createButton();
    }


}