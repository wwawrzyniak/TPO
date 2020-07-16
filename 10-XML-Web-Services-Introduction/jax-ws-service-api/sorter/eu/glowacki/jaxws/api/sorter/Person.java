package eu.glowacki.jaxws.api.sorter;

import javax.xml.bind.annotation.XmlType;
import java.util.Date;
@XmlType( //
        name = "PersonMessage", // name of the XmlType should be different from the name of the class
        namespace = "http://glowacki.eu/sorter" //
)
public class Person implements Comparable<Person>{


    private String FirstName;
    private String Surname;
    private Date BirthDate;

    public int compareTo(Person person) {
        return this.Surname.compareTo(person.getSurname());
    }
public Person(){}
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


    }





