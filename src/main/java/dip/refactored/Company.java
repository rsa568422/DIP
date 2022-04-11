package dip.refactored;

import dip.refactored.factory.EmployeePersistenceFactory;
import dip.refactored.persistence.EmployeePersistence;

import java.util.List;

public class Company {

    private final EmployeePersistence persistence;

    public Company(EmployeePersistenceFactory factory) {
        this.persistence = factory.getEmployeePersistence();
    }

    public List<Employee> getEmployees() {
        return this.persistence.findAll();
    }

    public void addEmployee(Employee employee) {
        this.persistence.save(employee);
    }

}
