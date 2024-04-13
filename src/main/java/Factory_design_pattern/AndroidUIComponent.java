
package Factory_design_pattern;

import java.awt.*;

class  AndroidUIComponent implements  UIcomponentFactoryDB{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }


    @Override
    public InterfaceMenu createMenu() {
        return new AndroidMenu();
    }
}