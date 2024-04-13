package Factory_design_pattern;

import javax.swing.*;

class  AndroidMenu implements InterfaceMenu{


    @Override
    public void createMenu() {
        System.out.println("Android Menu created");
    }
}