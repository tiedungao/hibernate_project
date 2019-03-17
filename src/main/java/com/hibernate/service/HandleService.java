package com.hibernate.service;

import com.hibernate.entity.Grade;
import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


/**
 * @Auther: gaoti
 * @Date: 2018/11/12 12:28
 * @Description:
 */

public class HandleService {

    @Test
    public void addData(){
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sf = configuration.buildSessionFactory();
        Session session=sf.openSession();

        Transaction tx=session.beginTransaction();
        Grade grade = new Grade("Java二班","学习Java的班级");
        Student student1 = new Student("张三","男");
        Student student2 = new Student("李四","女");
        grade.getStudentSet().add(student1);
        grade.getStudentSet().add(student2);
        session.save(grade);
        session.save(student1);
        session.save(student2);
        tx.commit();
        session.close();
        System.out.println(grade.getGname());

    }

}
