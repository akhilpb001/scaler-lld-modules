package com.scaler.lldmodule2.designpatterns.factory;

import com.scaler.lldmodule2.designpatterns.factory.components.buttons.Button;
import com.scaler.lldmodule2.designpatterns.factory.components.dropdowns.Dropdown;
import com.scaler.lldmodule2.designpatterns.factory.components.menus.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
