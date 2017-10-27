package by.tc.task02.service.breakfast;

import by.tc.task02.entity.breakfast.impl.Food;
import by.tc.task02.entity.breakfast.impl.Menu;
import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.Entity;
import by.tc.task02.entity.xml.impl.RootEntity;

public final class BreakfastBuilder {
    private static Menu menu;

    public static Menu buildBreakfast(RootEntity root) {
        menu = new Menu();
        XmlEntity[] children = root.getChildren();
        for (XmlEntity entity : children) {
            menu.addFood((Food) BreakfastDirector.getCommand(entity.getProperty()).create(entity));
        }
        return menu;
    }
}
