package by.tc.task02.entity.xml.impl;

import by.tc.task02.entity.xml.XmlEntity;

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
}
