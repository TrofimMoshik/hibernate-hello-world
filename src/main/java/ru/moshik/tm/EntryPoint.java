package ru.moshik.tm;

import org.hibernate.Session;
import ru.moshik.tm.entity.contact.ContactEntity;
import ru.moshik.tm.persistence.HibernateUtil;

import java.util.Date;

public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        ContactEntity contactEntity = new ContactEntity();

        contactEntity.setBirthDate(new Date());
        contactEntity.setFirstName("Chel");
        contactEntity.setLastName("Chelovekov");


        session.save(contactEntity);
        session.getTransaction().commit();

        session.close();

    }
}
