package org.example.ManyToMany;

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

        Courses courses= new Courses();
        courses.setId(1);
        courses.setName("java");

        Courses courses1= new Courses();
        courses1.setId(2);
        courses1.setName("HTML");

        Courses courses2= new Courses();
        courses2.setId(3);
        courses2.setName("c++");

        Courses courses3= new Courses();
        courses3.setId(1);
        courses3.setName("OS");

        Student student= new Student();
        student.setId(101);
        student.setName("neha");

        Student student1= new Student();
        student1.setId(102);
        student1.setName("shubhu");

        List<Courses> coursesList= null;
        coursesList.add(courses1);
        coursesList.add(courses3);

        student1.setCoursesList(coursesList);

        List<Courses> coursesList1= null;
        coursesList1.add(courses1);
        coursesList1.add(courses3);
        coursesList1.add(courses2);

        List<Student> studentList= null;
        studentList.add(student1);
        studentList.add(student);

        courses1.setStudents(studentList);

        List<Student> studentList2= null;
        studentList2.add(student1);
        studentList2.add(student);


        transaction.begin();
        manager.persist(courses1);
        manager.persist(courses);
        manager.persist(courses2);
        manager.persist(courses3);
        manager.persist(student1);
        manager.persist(student);
        transaction.commit();
    }
}
