package com.scaler.lldmodule2.designpatterns.creational.factory;

import com.scaler.lldmodule2.designpatterns.creational.factory.components.buttons.Button;
import com.scaler.lldmodule2.designpatterns.creational.factory.components.dropdowns.Dropdown;
import com.scaler.lldmodule2.designpatterns.creational.factory.components.menus.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
