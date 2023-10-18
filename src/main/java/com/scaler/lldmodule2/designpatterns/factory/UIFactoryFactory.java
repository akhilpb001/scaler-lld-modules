package com.scaler.lldmodule2.designpatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(SupportedPlatform supportedPlatform) {
        if (supportedPlatform == SupportedPlatform.ANDROID) {
            return new AndroidUIFactory();
        } else if (supportedPlatform == SupportedPlatform.IOS) {
            return new IOSUIFactory();
        }

        return null;
    }
}
