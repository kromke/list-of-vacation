package org.test.listofvacation.entities;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "fathers_name")
    private String fathersName;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "date_of_employment", nullable = false)
    private Date dateOfEmployment;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", dateOfBirth=" + dateOfBirth.getTime() +
                ", position='" + position + '\'' +
                ", dateOfEmployment=" + dateOfEmployment.getTime() +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
