package by.tc.task02.service.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.EntityWithContent;
import by.tc.task02.service.xml.XmlCreatorCommand;

import java.util.List;

public class EntityWithContentCreator implements XmlCreatorCommand {
    @Override
    public XmlEntity create(String properties, List<XmlEntity> children) {
        EntityWithContent entityWithContent = new EntityWithContent();
        String[] parsedData = properties.split(splitter);
        entityWithContent.setProperty(parsedData[1]);
        entityWithContent.setValue(parsedData[2]);
        return entityWithContent;
    }
}
