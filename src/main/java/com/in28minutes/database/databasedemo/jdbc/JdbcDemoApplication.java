package com.in28minutes.database.databasedemo.jdbc;

import java.util.Date;

import com.in28minutes.database.databasedemo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

//import com.in28minutes.database.databasedemo.entity.Person;


//@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

        private Logger logger = LoggerFactory.getLogger(this.getClass());

  //      @Autowired
       // PersonJdbcDao dao;

        public static void main(String[] args) {
                SpringApplication.run(JdbcDemoApplication.class, args);
        }

    //    @Override
        public void run(String... args) throws Exception {

         //       logger.info("All users -> {}", dao.findAll());

           //     logger.info("User id 10001 -> {}", dao.findbyId(10001));

             //   logger.info("Deleting 10002 -> No of Rows Deleted - {}",
                   //     dao.deleteById(10002,"cacca"));

               // logger.info("Inserting 10004 -> {}",
                 //       dao.insert(new Person(10004, "Tara", "Berlin", new Date())));

               // logger.info("Update 10003 -> {}",
                     //   dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));

        }
}