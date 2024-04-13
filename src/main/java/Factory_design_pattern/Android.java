package Factory_design_pattern;

import Factory_design_pattern.Platform;
import Factory_design_pattern.UIcomponentFactoryDB;

public class Android implements Platform{

    @Override
    public UIcomponentFactoryDB createUIComponentFactory() {
        return new AndroidUIComponent();
    }
}