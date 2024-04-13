package Factory_design_pattern;



class IOS implements Platform{

    @Override
    public UIcomponentFactoryDB createUIComponentFactory() {
        return new IOSUIComponent();
    }
}