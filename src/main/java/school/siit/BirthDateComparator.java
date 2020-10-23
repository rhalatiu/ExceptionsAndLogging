package school.siit;

import java.util.Comparator;

public class BirthDateComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
