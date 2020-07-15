package org.test.listofvacation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.listofvacation.entities.Employee;

public interface EmployeeRepoSpringData extends JpaRepository<Employee, Integer> {

    Employee findByLoginAndPassword(String login, String password);
}
