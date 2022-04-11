package dip.refactored.factory;

import dip.refactored.persistence.EmployeeMySqlPersistence;
import dip.refactored.persistence.EmployeePersistence;

public class EmployeeMySqlPersistenceFactory implements EmployeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistence() {
        return new EmployeeMySqlPersistence(System.getProperty("mysqlurl"),
                                            System.getProperty("mysqluser"),
                                            System.getProperty("mysqlpass"));
    }

}
