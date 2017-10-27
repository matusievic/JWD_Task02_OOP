package by.tc.task02.service.xml;

import by.tc.task02.entity.xml.XmlEntity;

import java.util.List;

public interface XmlCreatorCommand {
    String splitter = "<|(=\")|(\">)|>";
    XmlEntity create(String properties, List<XmlEntity> children);
}
