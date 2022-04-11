package dip.refactored.factory;

import dip.refactored.persistence.EmployeePersistence;

public interface EmployeePersistenceFactory {

    EmployeePersistence getEmployeePersistence();

}
