package org.example.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPersonTest {
    public static void main(String[] args) {

        EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= managerFactory.createEntityManager();

        Person person = manager.find(Person.class, 1);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println(person.getAdhar());
    }
}
