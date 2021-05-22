package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    public Person(String firstName, String lastName, String passportId, int age, String sex, String nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setPassportId(passportId);
        setAge(age);
        setSex(sex);
        setNationality(nationality);
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15) {
            this.firstName = firstName;
        } else {
            System.out.println("Please check the name ");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        } else {
            System.out.println("Please check the surname ");
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        if (passportId.length() == 8 && passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N') {
            this.passportId = passportId;
        } else {
            System.out.println("Please check the passport ");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Please check the age ");
        }
    }

    public String getSex() {
        return sex;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Person person = (Person) object;
        return java.util.Objects.equals(sex, person.sex);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), sex);
    }

    public void setSex(String sex) {
        if (sex.equalsIgnoreCase("female") || sex.equalsIgnoreCase("male")) {
            this.sex = sex;
        } else {
            System.out.println("Please check sex ");
        }

    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void dislay() {
        System.out.println("First name - " + getFirstName());
        System.out.println("Last name - " + getLastName());
        System.out.println("Passport ID - " + getPassportId());
        System.out.println("Age - " + getAge());
        System.out.println("Sex - " + getSex());
        System.out.println("Nationality - " + getNationality());
    }
}
