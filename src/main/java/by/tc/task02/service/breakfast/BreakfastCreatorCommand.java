package by.tc.task02.service.breakfast;

import by.tc.task02.entity.breakfast.BreakfastEntity;
import by.tc.task02.entity.xml.XmlEntity;

public interface BreakfastCreatorCommand {
    BreakfastEntity create(XmlEntity xmlEntity);
}
