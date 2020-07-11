package org.test.listofvacation.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.listofvacation.dto.EmployeeDataProvider;
import org.test.listofvacation.facade.FacadeEmployees;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    FacadeEmployees facadeEmployees;

    @SneakyThrows
    @GetMapping("/employees")
    public String getEmployeesList() {
        List<EmployeeDataProvider> list = facadeEmployees.getEmployeeList();
        ObjectMapper objectMapper = new ObjectMapper();
        return "<h1>Contact</h1>" +
                "<p>" + objectMapper.writeValueAsString(list) + "</p>";
    }
}
