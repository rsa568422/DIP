package dip.refactored;

import dip.refactored.factory.EmployeeMySqlPersistenceFactory;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(new EmployeeMySqlPersistenceFactory());
    }

}
