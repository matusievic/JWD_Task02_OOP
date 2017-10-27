package by.tc.task02.entity.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RootEntity implements XmlEntity {
    private String property;
    private List<Entity> children = new ArrayList<>();

    public RootEntity() {}

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void addChild(Entity child) {
        children.add(child);
    }

    public Entity[] getChildren() {
        return children.toArray(new Entity[children.size()]);
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
