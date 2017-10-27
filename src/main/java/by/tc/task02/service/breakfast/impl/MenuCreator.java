package by.tc.task02.service.breakfast.impl;

import by.tc.task02.entity.breakfast.BreakfastEntity;
import by.tc.task02.entity.breakfast.impl.Menu;
import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.service.breakfast.BreakfastCreatorCommand;

public class MenuCreator implements BreakfastCreatorCommand {
    @Override
    public BreakfastEntity create(XmlEntity xmlEntity) {
        Menu menu = new Menu();
        return menu;
    }
}
