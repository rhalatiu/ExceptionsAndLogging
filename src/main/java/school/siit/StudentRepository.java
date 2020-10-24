package school.siit;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class StudentRepository {
    HashSet<Student> studentHashSet = new HashSet<>();

    public void addStudent(Student student){
        studentHashSet.add(student);
    }

    public void deleteStudent(String ID) {

            for (Student studentID : studentHashSet) {
                if (studentID.getID().equals(ID)) {
                    studentHashSet.remove(ID);
                } else throw new IllegalArgumentException("The ID is empty, student does not exist");
            }
    }

    public List<Student> retrieveStudentsWithCertainAge(String age){
        ArrayList<Student> studentsAgeOrder = new ArrayList<>();
        LocalDate today = LocalDate.now();
        int newAge = Integer.parseInt(age);
        try {
        if (newAge < 0){
            throw new IllegalArgumentException("The age is negative");}
        for (Student studentAge : studentHashSet){
            if (newAge == Period.between(studentAge.getDateOfBirth(), today).getYears()){
                studentsAgeOrder.add(studentAge);
            }
        }
        }catch (NumberFormatException e) {
            throw new NumberFormatException("The age is not a number");
        }
        return studentsAgeOrder;
    }

    public List<Student> orderStudents(List<Student> list){
        List<Student> studentsOrder = new ArrayList<>(studentHashSet);
        Collections.sort(studentsOrder, new LastNameComparator());
        Collections.sort(studentsOrder, new BirthDateComparator());
        return studentsOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentRepository that = (StudentRepository) o;
        return Objects.equals(studentHashSet, that.studentHashSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentHashSet);
    }
}