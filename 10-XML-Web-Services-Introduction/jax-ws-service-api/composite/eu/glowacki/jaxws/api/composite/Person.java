package eu.glowacki.jaxws.api.composite;

import java.util.Date;

public class Person implements Comparable<Person>{


    private String FirstName;
    private String Surname;
    private Date BirthDate;

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", BirthDate=" + BirthDate +
                '}';
    }

    public Person(String firstName, String surname, Date birthDate) {
        FirstName = firstName;
        Surname = surname;
        BirthDate = birthDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public int compareTo(Person o) {
        return getSurname().compareTo(o.getSurname());
    }

}


