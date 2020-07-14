package org.test.listofvacation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacationDataProvider {

    private Integer id;

    private String lastName;

    private String firstName;

    private String fathersName;

    private String position;

    private Date startDate;

    private Date endDate;
}
