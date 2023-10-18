package com.scaler.lldmodule2.designpatterns.factory;

import com.scaler.lldmodule2.designpatterns.factory.components.buttons.AndroidButton;
import com.scaler.lldmodule2.designpatterns.factory.components.dropdowns.AndroidDropdown;
import com.scaler.lldmodule2.designpatterns.factory.components.menus.AndroidMenu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
