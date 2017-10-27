package by.tc.task02.service.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.Entity;
import by.tc.task02.service.xml.XmlCreatorCommand;

public class EntityCreator implements XmlCreatorCommand {
    @Override
    public XmlEntity create(String properties) {
        Entity entity = new Entity();
        String[] parsedData = properties.split(splitter);
        entity.setProperty(parsedData[0]);
        entity.setId(Integer.parseInt(parsedData[1]));
        return entity;
    }
}
