package com.scaler.lldmodule2.designpatterns.creational.factory;

import com.scaler.lldmodule2.designpatterns.creational.factory.components.buttons.Button;
import com.scaler.lldmodule2.designpatterns.creational.factory.components.menus.Menu;

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
