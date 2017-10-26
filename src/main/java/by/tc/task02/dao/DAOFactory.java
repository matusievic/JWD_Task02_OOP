package by.tc.task02.dao;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();



    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
