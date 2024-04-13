package Factory_design_pattern;

import javax.swing.*;

class  IOSMenu implements InterfaceMenu{


    @Override
    public void createMenu() {
        System.out.println("IOSMenu Menu created");
    }
}