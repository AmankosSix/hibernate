package com.jointable;

import com.jointable.entities.Child;
import com.jointable.entities.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory()) {
//            Session session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Aman", 5);
//            Child child2 = new Child("Dauren", 6);
//            Child child3 = new Child("Rinat", 4);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
            //********************************************************

//            Session session = factory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Altynay", 5);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.persist(child1);
//
//            session.getTransaction().commit();
            //********************************************************

//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//
//            Section section = session.get(Section.class, 3);
//
//            child.addSectionToChild(section);
//
//            child.setName("Gaukhar");
//
//            session.merge(child);
//
//            session.getTransaction().commit();
            //********************************************************

//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 3);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
            //********************************************************

//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
            //********************************************************

//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 5);
//
//            session.remove(section);
//
//            session.getTransaction().commit();
            //********************************************************

//            Session session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Nuray", 5);
//            Child child2 = new Child("Indira", 6);
//            Child child3 = new Child("Serzhan", 4);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
            //********************************************************

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 4);

            session.remove(child);

            session.getTransaction().commit();
        }
    }
}
