package dip.refactored.persistence;

import dip.refactored.Employee;

import java.util.List;

public interface EmployeePersistence {

    List<Employee> findAll();

    void save(Employee employee);

}
