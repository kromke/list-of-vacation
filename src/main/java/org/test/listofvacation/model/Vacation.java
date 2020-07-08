package org.test.listofvacation.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vacations")
public class Vacation {

    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private @Basic
    @Column
    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    int employee_id;
}
