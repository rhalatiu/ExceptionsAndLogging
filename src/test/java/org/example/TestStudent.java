package org.example;

import org.junit.Assert;
import org.junit.Test;
import school.siit.Student;

public class TestStudent {

    @Test
    public void studentConstructorTest(){
        Student st1 = new Student("Radu", "Halatiu", "1899", "MALE", "88" );

        Assert.assertEquals("RaduHalatiu1899MALE88", "RaduHalatiu1899MALE88");
    }
}
