package dip.refactored.persistence;

import dip.refactored.Employee;

import java.util.List;

public class EmployeeMySqlPersistence implements EmployeePersistence {

    public EmployeeMySqlPersistence(String url, String user, String pass) {
        // TODO :: realizar la conexión a la base de datos
    }

    @Override
    public List<Employee> findAll() {
        // TODO :: consulta a la base de datos
        return null;
    }

    @Override
    public void save(Employee employee) {
        // TODO :: insert en la base de datos
    }

}
