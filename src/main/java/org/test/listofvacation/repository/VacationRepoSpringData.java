package org.test.listofvacation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.listofvacation.entities.Vacation;

public interface VacationRepoSpringData extends JpaRepository<Vacation, Integer> {
}
