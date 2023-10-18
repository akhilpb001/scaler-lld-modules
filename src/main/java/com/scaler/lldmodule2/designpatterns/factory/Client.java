package com.scaler.lldmodule2.designpatterns.factory;

import com.scaler.lldmodule2.designpatterns.factory.components.buttons.Button;
import com.scaler.lldmodule2.designpatterns.factory.components.menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        flutter.setTheme();
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        button.changeSize();
        Menu menu = uiFactory.createMenu();
        menu.changeSize();
    }
}
