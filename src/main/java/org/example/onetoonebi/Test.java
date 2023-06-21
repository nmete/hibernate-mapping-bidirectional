package org.example.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

    public static void main(String[] args) {
        Person person= new Person();
        person.setId(1);
        person.setName("ram");
        person.setAddress("latur ");

        Adhar adhar= new Adhar();
        adhar.setId(101);
        adhar.setDob("21/01/1998");
        adhar.setDob("qwdqwe");
        adhar.setPerson(person);

        person.setAdhar(adhar);

        EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= managerFactory.createEntityManager();

        EntityTransaction transaction= manager.getTransaction();

        transaction.begin();
        manager.persist(adhar);
        manager.persist(person);
        transaction.commit();
    }
}
