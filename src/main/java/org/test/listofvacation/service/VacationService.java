package org.test.listofvacation.service;

import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.entities.Vacation;

import java.util.List;
import java.util.Map;

public interface VacationService {

    List<Vacation> getVacations();

    Map<Employee, List<Vacation>> getMappedVacations();
}
