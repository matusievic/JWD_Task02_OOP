package by.tc.task02.service.xml;

import by.tc.task02.service.xml.impl.EntityCreator;
import by.tc.task02.service.xml.impl.EntityWithContentCreator;
import by.tc.task02.service.xml.impl.RootEntityCreator;

import java.util.HashMap;
import java.util.Map;

public final class XmlDirector {
    private static Map<String, XmlCreatorCommand> commands = new HashMap<>();

    static {
        commands.put("<.+>\\s</.+>", new RootEntityCreator());
        commands.put("<.+\\s=\"\\d\">\\s</.+>", new EntityCreator());
        commands.put("<[a-zA-Z]+>.+</[a-zA-Z]+>", new EntityWithContentCreator());
    }

    public static XmlCreatorCommand execute(String sourceData) {
        for (String k : commands.keySet()) {
            if (sourceData.matches(k)) {
                return commands.get(k);
            }
        }

        return null;
    }
}
