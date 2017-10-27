package by.tc.task02.entity.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;

import java.util.Objects;

public class EntityWithContent  implements XmlEntity {
    private String property;
    private String value;

    public EntityWithContent() {}

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        EntityWithContent entityWithContent = (EntityWithContent) obj;
        if (!property.equals(entityWithContent.property)) { return false; }
        if (!value.equals(entityWithContent.value)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = Objects.hashCode(property);
        hash = 31 * hash + Objects.hashCode(value);
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "property: " + property + ", value: " + value;
    }
}
