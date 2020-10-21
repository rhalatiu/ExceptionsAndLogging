package school.siit;

import java.util.Comparator;
import java.util.HashSet;

public class StudentRepository {
    int index = 100;
    HashSet<Student> studentHashSet = new HashSet<>();

    public void addStudent(Student student){
        studentHashSet.add(student);
    }

    public void deleteStudent(String ID){
        for (Student studentID : studentHashSet){
            if (studentID.getID().equals(ID)){
                studentHashSet.remove(ID);
            }
        }
    }

    //retrieve students by age
    //public

    //comparing the last names of students
    class LastNameComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    //comparing the birth date of students
    class BirthDateComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        }
    }
}