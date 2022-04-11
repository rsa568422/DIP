package dip.refactored.factory;

import dip.refactored.persistence.EmployeeMemoryPersistence;
import dip.refactored.persistence.EmployeePersistence;

public class EmployeeMemoryPersistenceFactory implements EmployeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistence() {
        return new EmployeeMemoryPersistence();
    }

}
