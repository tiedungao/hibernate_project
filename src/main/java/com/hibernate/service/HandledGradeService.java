package com.hibernate.service;

import com.hibernate.entity.Grade;
import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandledGradeService {

    Configuration configuration ;
    private SessionFactory sessionFactory;
    private Session session;
    private Session session1;
    private Transaction transaction;
    private Transaction transaction1;

    @Before
    public void beforeInit(){
        configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session1 = sessionFactory.openSession();
        transaction = session.beginTransaction();
        transaction1 = session1.beginTransaction();
    }

    @Test
    public void handleGrade(){
        Grade grade = session.get(Grade.class,1);
        System.out.println(grade.getGname());

        Grade grade1 = session1.get(Grade.class,1);
        System.out.println(grade1.getGname());

        session.persist(grade);
        transaction.commit();

        session1.persist(grade);
        transaction1.commit();
    }

    @After
    public void closeResource(){
        session.close();
        sessionFactory.close();
    }

}
