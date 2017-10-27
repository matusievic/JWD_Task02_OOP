package by.tc.task02.service.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.RootEntity;
import by.tc.task02.service.xml.XmlCreatorCommand;

import java.util.List;

public class RootEntityCreator implements XmlCreatorCommand {
    @Override
    public XmlEntity create(String properties, List<XmlEntity> children) {
        RootEntity rootEntity = new RootEntity();
        String[] pasedData = properties.split(splitter);
        rootEntity.setProperty(pasedData[1]);
        for (XmlEntity e : children)
            rootEntity.addChild(e);
        return rootEntity;
    }
}
