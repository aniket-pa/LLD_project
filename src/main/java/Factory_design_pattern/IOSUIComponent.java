
package Factory_design_pattern;

import java.awt.*;

class  IOSUIComponent implements  UIcomponentFactoryDB{

    @Override
    public Button createButton() {
        return new IOSButton();
    }


    @Override
    public InterfaceMenu createMenu() {
        return new IOSMenu();
    }
}