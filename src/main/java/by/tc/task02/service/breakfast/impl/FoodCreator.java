package by.tc.task02.service.breakfast.impl;

import by.tc.task02.entity.breakfast.BreakfastEntity;
import by.tc.task02.entity.breakfast.impl.Food;
import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.Entity;
import by.tc.task02.entity.xml.impl.EntityWithContent;
import by.tc.task02.service.breakfast.BreakfastCreatorCommand;

public class FoodCreator implements BreakfastCreatorCommand {
    @Override
    public BreakfastEntity create(XmlEntity xmlEntity) {
        Food food = new Food();
        EntityWithContent[] properties = ((Entity) xmlEntity).getChildren();
        for (EntityWithContent e : properties) {
            if (e.getProperty().equals("property")) {
                food.setName(e.getValue());
            } else if (e.getProperty().equals("price")) {
                food.setPrice(e.getValue());
            }
        }
        food.setId(((Entity) xmlEntity).getId());
        return food;
    }
}
