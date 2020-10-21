package school.siit;

import java.time.Year;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String ID;

    public Student(String firstName, String lastName, String dateOfBirth, String gender, String ID) {
        this.dateOfBirth = dateOfBirth;

        if (!firstName.equals("")) {
            this.firstName = firstName;
        }else throw new IllegalArgumentException("First name should not be empty");


        if (!lastName.equals("")) {
            this.lastName = lastName;
        }else throw new IllegalArgumentException("Last name should not be empty");

        try {
            int year = Year.now().getValue();
            int dateOfBirthInt = Integer.parseInt(dateOfBirth);
            if (dateOfBirthInt >= 1900 && dateOfBirthInt <= year - 18)
                this.dateOfBirth = dateOfBirth;
        }catch (Exception ex)
        {throw new IllegalArgumentException("Date of birth between 1900 and current year - 18 "); }


        if ((!gender.toLowerCase().equals("male")) && (!gender.toLowerCase().equals("female")) || (!gender.toLowerCase().equals("m")) && (!gender.toLowerCase().equals("f"))) {
            throw new IllegalArgumentException("The gender should be male(m) or female(f)");
        } else this.gender = gender;

        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getID() {
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