package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import school.siit.Student;

public class TestStudent {

    static final Logger logger = LogManager.getLogger(Student.class.getName());

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void studentConstructorTest(){

        Student student1 = new Student("", "Halatiu","1992-08-11","male","1234");
        Student student2 = new Student("Radu", "","1992-08-11","male","1234");
        Student student3 = new Student("Radu", "Halatiu","1899-08-22","male","1234");
        Student student4 = new Student("Radu", "Halatiu","1992-08-11","w","1234");


        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("First name should not be empty");
        //thrown
    }
}
