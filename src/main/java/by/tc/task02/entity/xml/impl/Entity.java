package by.tc.task02.entity.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Entity implements XmlEntity {
    private String property;
    private int id;
    private List<EntityWithContent> children = new ArrayList<>();

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

    public void addChildren(EntityWithContent child) {
        children.add(child);
    }

    public EntityWithContent[] getChildren() {
        return children.toArray(new EntityWithContent[children.size()]);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        Entity entity = (Entity) obj;
        if (!property.equals(entity.property)) { return false; }
        if (id != entity.id) { return false; }
        if (!children.equals(entity.children)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = Objects.hashCode(property);
        hash = 31 * hash + id;
        hash = 31 * hash + children.hashCode();
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "property: " + property + ", id: " + id + ", children: " + children;
    }
}
