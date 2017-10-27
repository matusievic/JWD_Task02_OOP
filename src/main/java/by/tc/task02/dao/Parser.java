package by.tc.task02.dao;

import by.tc.task02.entity.xml.impl.RootEntity;

public interface Parser {
    RootEntity parse(String filePath);
}
