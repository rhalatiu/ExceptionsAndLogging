package school.siit;

import java.util.HashSet;

public class StudentRepository {
    HashSet<Student> studentHashSet = new HashSet<>();

    public void addStudent(Student student){
        studentHashSet.add(student);
    }

    public void deleteStudent(String ID){

    }
}