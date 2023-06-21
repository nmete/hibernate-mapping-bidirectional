package org.example.OTM_MTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= managerFactory.createEntityManager();

        EntityTransaction transaction= manager.getTransaction();

       Items items= new Items();
       items.setId(1);
       items.setName("TV");

        Items items1= new Items();
        items1.setId(2);
        items1.setName("Mobile");

        Items items3= new Items();
        items3.setId(3);
        items3.setName("headset");

        Card card= new Card();
        card.setId(101);
        card.setName("neha's card");
        List<Items> item=null;

        item.add(items);
        item.add(items1);
        item.add(items3);

        items.setCard(card);
        items1.setCard(card);
        items3.setCard(card);

        transaction.begin();
        manager.persist(item);
        manager.persist(items1);
        manager.persist(items3);

        transaction.commit();


    }
}
