package org.test.listofvacation.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private @Basic
    @Column
    String last_name;
    private @Basic
    @Column
    String first_name;
    private @Basic
    @Column
    String fathers_name;
    private @Basic
    @Column
    Date date_of_birth;
    private @Basic
    @Column
    String position;
    private @Basic
    @Column
    Date date_of_employment;
    private @Basic
    @Column
    String login;
    private  @Basic
    @Column
    String password;

}
