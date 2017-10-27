package by.tc.task02.dao.impl;

import by.tc.task02.dao.Parser;
import by.tc.task02.entity.xml.XmlEntity;
import by.tc.task02.entity.xml.impl.RootEntity;
import by.tc.task02.service.xml.XmlDirector;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class ParserImpl implements Parser {
    private String rootEntityRegEx = "(<.+>)|(</.+>)";
    private String entityRegEx = "<.+=\"\\d+\">|</.+>";
    private String entityWithContentRegEx = "<.+>.+</.+>";

    public RootEntity parse(String filePath) {
        try (Scanner inFile = new Scanner(new File(filePath))) {
            Deque<String> stringStack = new ArrayDeque<>();
            String current = null;
            List<XmlEntity> entities = new ArrayList<>();
            while (inFile.hasNextLine()) {
                do {
                    current = inFile.nextLine().trim();
                } while (current.isEmpty());
                if (current.matches(rootEntityRegEx)) {
                    rootEntityRegEx = "</" + current.substring(1, current.length() - 1) + '>';
                    stringStack.push(current);
                    do {
                        do {
                            current = inFile.nextLine().trim();
                        } while (current.isEmpty());
                        if (current.matches(entityRegEx) && !current.matches(rootEntityRegEx)) {
                            stringStack.push(current);
                            List<XmlEntity> contentEntities = new ArrayList<>();
                            do {
                                current = inFile.nextLine().trim();
                            } while (current.isEmpty());
                            do {
                                contentEntities.add(XmlDirector.execute(current).create(current, null));
                                do {
                                    current = inFile.nextLine().trim();
                                } while (current.isEmpty());
                            } while (current.matches(entityWithContentRegEx));
                            current = stringStack.pop() + current;
                            entities.add(XmlDirector.execute(current).create(current, contentEntities));
                        }
                    } while (!current.matches(rootEntityRegEx));
                    rootEntityRegEx = "(<.+>)|(</.+>)";
                }
            }
            current = stringStack.pop() + current;
            return (RootEntity) XmlDirector.execute(current).create(current, entities);
        } catch (IOException e) {
            return null;
        }
    }
}
