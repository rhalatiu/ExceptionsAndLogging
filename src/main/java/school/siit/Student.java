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
        LocalDate startLocalDate = LocalDate.of(1900,01,01);
        LocalDate now = LocalDate.now();
        if ((Period.between(startLocalDate, this.dateOfBirth).getYears() > 120) || Period.between(this.dateOfBirth, now).getYears() < 18){
            throw new IllegalArgumentException("The age is less than 18 and grater than 120 years old");}



        if ((!gender.toLowerCase().equals("male")) && (!gender.toLowerCase().equals("female"))) {
            throw new IllegalArgumentException("The gender should be male(m) or female(f)");
        } else this.gender = gender;

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

    /*public void addStudent() throws Exception{
        Scanner firstNameScanner = new Scanner(System.in);
        System.out.println("Add the student's first name");
        try {
            String firstNameValue = firstNameScanner.nextLine();
            System.out.println(firstNameValue);
        }catch (Exception e){
        System.out.println("No correct value");}

        Scanner lastNameScanner = new Scanner(System.in);
        System.out.println("Add the student's last name");
        try{
            String lastNameValue = lastNameScanner.nextLine();
            System.out.println(lastNameValue);
        }catch (Exception e){
            System.out.println("Incorrect value added");
        }
    }*/
}