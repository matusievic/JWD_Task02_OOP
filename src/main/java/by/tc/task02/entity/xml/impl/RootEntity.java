package by.tc.task02.entity.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        RootEntity rootEntity = (RootEntity) obj;
        if (!property.equals(rootEntity.property)) { return false; }
        if (!children.equals(rootEntity.children)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = Objects.hashCode(property);
        hash = 31 * hash + children.hashCode();
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "property: " + property + ", children: " + children;
    }
}
