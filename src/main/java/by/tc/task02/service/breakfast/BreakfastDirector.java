package by.tc.task02.service.breakfast;

import by.tc.task02.service.breakfast.impl.FoodCreator;
import by.tc.task02.service.breakfast.impl.MenuCreator;

import java.util.HashMap;
import java.util.Map;

public final class BreakfastDirector {
    private static Map<String, BreakfastCreatorCommand> commands = new HashMap<>();

    static {
        commands.put("breakfast-menu", new MenuCreator());
        commands.put("food", new FoodCreator());
    }

    public static BreakfastCreatorCommand getCommand(String typeName) {
        return commands.get(typeName);
    }
}
