package org.test.listofvacation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private EntityManager em;

    @BeforeEach
    void setUp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "employees" );
        em = emf.createEntityManager();
    }

    @AfterEach
    void tearDown() {
        em.getEntityManagerFactory().close();
        em.close();
    }

    @Test
    public void shouldStartHibernate() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "employees" );
        EntityManager entityManager = emf.createEntityManager();
    }
}