package org.test.listofvacation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.listofvacation.entities.Employee;
import org.test.listofvacation.entities.Vacation;
import org.test.listofvacation.repository.VacationRepoSpringData;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class VacationServiceImpl implements VacationService {

    @Autowired
    VacationRepoSpringData vacationRepoSpringData;

    @Override
    public List<Vacation> getVacations() {
        return vacationRepoSpringData.findAll();
    }

    @Override
    public Map<Employee, List<Vacation>> getMappedVacations() {
        List<Vacation> vacations = this.getVacations();
        return vacations.stream()
                .collect(Collectors.groupingBy(Vacation::getEmployee));
    }
}
