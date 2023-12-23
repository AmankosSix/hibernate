package com.amankos;

import com.amankos.config.MyConfig;
import com.amankos.entities.Detail;
import com.amankos.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

//            Employee emp = new Employee("Altynay", "Sultan", "HR", 2000);
//            Detail detail = new Detail("Astana", "87771234567", "altynay@gmail.com");
//            emp.setDetail(detail);
//            detail.setEmployee(emp);


            session.beginTransaction();
            Detail detail = session.get(Detail.class, 2);
            session.remove(detail);
            session.getTransaction().commit();

            // delete employee where name = "Gaukhar"
//            session.beginTransaction();
//            session.createQuery("delete Employee where name = :name")
//                    .setParameter("name", "Gaukhar")
//                    .executeUpdate();
//            session.getTransaction().commit();

            // delete employee with id = 1
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//            session.getTransaction().commit();

            // update salary for all employees with salary < 700
//            session.beginTransaction();
//            session.createQuery("update Employee set salary = :newSalary where salary < :oldSalary")
//                    .setParameter("newSalary", 1500)
//                    .setParameter("oldSalary", 700)
//                    .executeUpdate();
//            session.getTransaction().commit();


            // get all employees with salary > 650 and order by salary DESC
//            session.beginTransaction();
//            List<Employee> employees = session.createQuery("from Employee where salary > 650 order by salary DESC").getResultList();
//            for(Employee employee: employees) {
//                System.out.println(employee);
//            }
//            session.getTransaction().commit();

            // create new employee
//            Employee emp = new Employee("Gaukhar", "Sultan", "Sales", 600);
//
//            session.beginTransaction();
//            session.persist(emp);
//            int myId = emp.getId();
//            Employee employee = session.get(Employee.class, myId);
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 10);
//            session.getTransaction().commit();

        }

//        AnnotationConfigApplicationContext context =
//            new AnnotationConfigApplicationContext(MyConfig.class);
//
//        context.close();
    }
}
