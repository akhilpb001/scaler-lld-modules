package com.scaler.lldmodule2.designpatterns.factory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme() {
        System.out.println("Setting theme.");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate.");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactoryForPlatform(supportedPlatform);
    }
}
