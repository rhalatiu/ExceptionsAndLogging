package school.siit;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String ID;

    public Student(String firstName, String lastName, String dateOfBirth, String gender, String ID) {

        if (!firstName.equals("")) {
            this.firstName = firstName;
        } else throw new IllegalArgumentException("First name should not be empty");


        if (!lastName.equals("")) {
            this.lastName = lastName;
        } else throw new IllegalArgumentException("Last name should not be empty");

        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        LocalDate now = LocalDate.now();
        if ((Period.between(this.dateOfBirth, now).getYears() > 120) || Period.between(this.dateOfBirth, now).getYears() < 18){
            throw new IllegalArgumentException("The age is less than 18 or grater than 120 years old"); }


        if (!gender.toLowerCase().equals("male") && !gender.toLowerCase().equals("female")) {
            throw new IllegalArgumentException("The gender should be male or female");
        }
        else this.gender = gender;

        this.ID = ID;
        }


        public String getFirstName () {
            return firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public LocalDate getDateOfBirth () {
            return dateOfBirth;
        }

        public String getGender () {
            return gender;
        }

        public String getID () {
            return ID;
        }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}