package by.tc.task02.controller;

import by.tc.task02.dao.DAOFactory;
import by.tc.task02.dao.Parser;
import by.tc.task02.entity.breakfast.impl.Food;
import by.tc.task02.entity.breakfast.impl.Menu;
import by.tc.task02.entity.xml.impl.RootEntity;
import by.tc.task02.service.breakfast.BreakfastBuilder;

public final class Controller {
    public static void getDataFromFile(String file) {
        Parser parser = DAOFactory.getInstance().getParser();
        RootEntity root = parser.parse(file);

        Menu menu = BreakfastBuilder.buildBreakfast(root);
        Food[] foods = menu.getFoods();
        for (Food f : foods) {
            System.out.println(f.getId() + ". " + f.getName() + " - " + f.getPrice());
        }
    }
}
