package by.tc.task02.dao;

import by.tc.task02.dao.impl.ParserImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final Parser parser = new ParserImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public Parser getParser() {
        return parser;
    }
}
