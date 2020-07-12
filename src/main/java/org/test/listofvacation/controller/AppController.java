package org.test.listofvacation.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.listofvacation.dto.EmployeeDataProvider;
import org.test.listofvacation.facade.FacadeEmployees;

import java.util.List;

@RestController("/employees")
public class AppController {

    @Autowired
    FacadeEmployees facadeEmployees;

    @Autowired
    ObjectMapper objectMapper;

    @SneakyThrows
    @GetMapping("/employees")
    public String getEmployeesList() {
        return objectMapper.writeValueAsString(facadeEmployees.getEmployeeVacationList());
    }

    @SneakyThrows
    @GetMapping("/vacations")
    public String getVacations() {
        return objectMapper.writeValueAsString(facadeEmployees.getVacationsList());
    }

//    @PostMapping
//    public
}
