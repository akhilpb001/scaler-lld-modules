package com.scaler.lldmodule2.designpatterns.factory;

import com.scaler.lldmodule2.designpatterns.factory.components.buttons.IOSButton;
import com.scaler.lldmodule2.designpatterns.factory.components.dropdowns.IOSDropdown;
import com.scaler.lldmodule2.designpatterns.factory.components.menus.IOSMenu;

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
