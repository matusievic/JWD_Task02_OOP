package by.tc.task02.entity.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;

import java.util.ArrayList;
import java.util.List;

public class Entity implements XmlEntity {
    private String property;
    private int id;
    private List<XmlEntity> children = new ArrayList<>();

    public Entity() {}


    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addChildren(XmlEntity child) {
        children.add(child);
    }

    public XmlEntity[] getChildren() {
        return (XmlEntity[]) children.toArray();
    }
}
