package by.tc.task02.service.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.Entity;
import by.tc.task02.entity.xml.impl.EntityWithContent;
import by.tc.task02.service.xml.XmlCreatorCommand;

import java.util.List;

public class EntityCreator implements XmlCreatorCommand {
    @Override
    public XmlEntity create(String properties, List<XmlEntity> children) {
        Entity entity = new Entity();
        String[] parsedData = properties.split(splitter);
        entity.setProperty(parsedData[1].split(" ")[0]);
        entity.setId(Integer.parseInt(parsedData[2]));
        for (XmlEntity e : children)
            entity.addChildren((EntityWithContent) e);
        return entity;
    }
}
