package com.scaler.lldmodule2.designpatterns.creational.factory;

import com.scaler.lldmodule2.designpatterns.creational.factory.components.buttons.IOSButton;
import com.scaler.lldmodule2.designpatterns.creational.factory.components.dropdowns.IOSDropdown;
import com.scaler.lldmodule2.designpatterns.creational.factory.components.menus.IOSMenu;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
