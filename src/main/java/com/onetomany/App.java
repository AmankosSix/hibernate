package com.onetomany;

import com.onetomany.entities.Department;
import com.onetomany.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

//            Department department = new Department("IT", 3000, 1000);
//
//            Employee employee1 = new Employee("Aman", "Kos", 1000);
//            Employee employee2 = new Employee("John", "Doe", 2000);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();
//            session.persist(department);
//            Department department = session.get(Department.class, 1);
//            System.out.println(department.getEmployeeList());
            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());
            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }
}
