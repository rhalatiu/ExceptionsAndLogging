package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import school.siit.Student;
import school.siit.StudentRepository;
import static org.junit.Assert.*;

public class TestStudentRepository {
    Student student1 = new Student("Radu", "Halatiu","1992-08-11","male","1234");
    Student student2 = new Student("Simion", "Belbe","1992-04-11","male","1235");
    Student student3 = new Student("Andrei", "Zaha","1992-05-20","male","1236");
    Student student4 = new Student("Dan", "Alexandru","1992-04-23","male","1237");
    Student student5 = new Student("Ioana", "Badea","1992-10-23","female","1238");
    Student student6 = new Student("Cosmina", "Petria","1992-02-05","female","1239");

    StudentRepository studentRepo = new StudentRepository();

    static final Logger logger = LogManager.getLogger(StudentRepository.class.getName());

    @Test
    public void addStudent(){
        try {
            studentRepo.addStudent(new Student("Radu", "", "1992-08-11", "male", "1234"));
            //studentRepo.addStudent(new Student("Radu","","1992-08-11", "male","1234"));
            //studentRepo.addStudent(new Student("Radu","Halatiu","1899-08-11", "male","1234"));
            //studentRepo.addStudent(new Student("Radu","Halatiu","1992-08-11", "w","1234"));
        }catch (Exception e){
            logger.error(e);
        }
    }

    @Test
    public void deleteStudent(){
        studentRepo.addStudent(student1);
        studentRepo.addStudent(student2);
        studentRepo.addStudent(student3);
        studentRepo.addStudent(student4);
        studentRepo.addStudent(student5);
        studentRepo.addStudent(student6);

        try {
            studentRepo.deleteStudent("");
        }catch (NullPointerException e){
            logger.error(e);
        }

    }

//    @Test
//    void retrieveStudentsWithCertainAge(){
//
//    }
//
//    @Test
//    void orderStudents(){
//
//    }
}