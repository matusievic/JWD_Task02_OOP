package by.tc.task02.entity.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;

import java.util.ArrayList;
import java.util.List;

public class RootEntity implements XmlEntity {
    private String property;
    private List<XmlEntity> children = new ArrayList<XmlEntity>();

    public RootEntity() {}

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void addChild(XmlEntity child) {
        children.add(child);
    }

    public XmlEntity[] getChildren() {
        return (XmlEntity[]) children.toArray();
    }
}
