package com.in28minutes.database.databasedemo.jpa;


import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
//Repository
//Transaction
public class PersonJpaRepository {

    //connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public Person findbyId(int id) {
        return entityManager.find(Person.class, id) ; //JPA





    }
}
