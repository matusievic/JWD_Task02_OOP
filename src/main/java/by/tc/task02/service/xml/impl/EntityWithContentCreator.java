package by.tc.task02.service.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.EntityWithContent;
import by.tc.task02.service.xml.XmlCreatorCommand;

public class EntityWithContentCreator implements XmlCreatorCommand {
    @Override
    public XmlEntity create(String properties) {
        EntityWithContent entityWithContent = new EntityWithContent();
        String[] parsedData = properties.split(splitter);
        entityWithContent.setProperty(parsedData[0]);
        entityWithContent.setValue(parsedData[1]);
        return entityWithContent;
    }
}
