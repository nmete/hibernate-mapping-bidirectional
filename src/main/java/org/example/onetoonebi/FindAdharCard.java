package org.example.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAdharCard {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= managerFactory.createEntityManager();

        Adhar  adhar = manager.find(Adhar.class, 1);
        System.out.println(adhar.getName());
        System.out.println(adhar.getDob());
        System.out.println(adhar.getId());

        System.out.println("=========================");
        Person person= adhar.getPerson();
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println(person.getAdhar());
    }

}
