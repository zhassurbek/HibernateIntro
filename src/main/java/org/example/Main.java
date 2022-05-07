package org.example;

//import entity.User;
import jakarta.persistence.Query;
import org.hibernate.Session;

import jakarta.persistence.Query;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        session.close();
        HibernateUtil.close();

        //save new data
        session.getTransaction().begin();
//
//        User user = new User();
//        user.setEmail("asdf2@gmail.com");
//        user.setUsername("makhanov2");
//        user.setPassword("asdfasdf");
//        // id не указываем
//
//        session.save(user);
//
//        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.close();

        //HQL
//        Query query = session.createQuery("From User");
//        List<User> users = query.getResultList();
//
//        System.out.println(users.get(0));
//        session.close();
//        HibernateUtil.close();

    }

}