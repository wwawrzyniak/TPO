package eu.glowacki.jaxws.implementation.sorter.test;

import eu.glowacki.jaxws.client.sorter.Client;
import eu.glowacki.jaxws.client.sorter.proxy.PersonMessage;
import eu.glowacki.jaxws.client.sorter.proxy.SortRequestMessage;
import eu.glowacki.jaxws.client.sorter.proxy.SortResponseMessage;
import eu.glowacki.jaxws.implementation.sorter.SorterImpl;
import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public final class SorterImplTest {


    static List<PersonMessage> personMessageList = new ArrayList();
    Client client = new Client();

    //seed list with data, run server
    @BeforeAll
    static void seedList(){
        PersonMessage p1 = new PersonMessage();
        PersonMessage p2 = new PersonMessage();
        PersonMessage p3 = new PersonMessage();
        PersonMessage p4 = new PersonMessage();
        p1.setFirstName("Stefan");
        p1.setSurname("Stefanski");
        p1.setBirthDate(Date.valueOf("1999-01-01"));
        p2.setFirstName("Ala");
        p2.setSurname("Kocinska");
        p2.setBirthDate(Date.valueOf("1990-01-01"));
        //First by Surname
        p3.setFirstName("Beata");
        p3.setSurname("Batecka");
        p3.setBirthDate(Date.valueOf("1989-01-01"));
        //First by Birthdate
        p4.setFirstName("Celina");
        p4.setSurname("Celtycka");
        p4.setBirthDate(Date.valueOf("1970-01-01"));
        personMessageList.add(p2);
        personMessageList.add(p3);
        personMessageList.add(p1);
        personMessageList.add(p4);

        SorterImpl tester = new SorterImpl();
        tester.main();
    }

    @Test
    public void sortByBirthDate() throws MalformedURLException {
        SortRequestMessage requestByBirthDate = new SortRequestMessage();
        requestByBirthDate.setPeople(personMessageList);
        SortResponseMessage responseByBirthDate = client.mainWithSortByBirthDate(requestByBirthDate);
        Assert.assertEquals(("Celina"), responseByBirthDate.getResult().get(0).getFirstName());
        Assert.assertEquals(("Beata"), responseByBirthDate.getResult().get(1).getFirstName());
    }
    @Test
    public void sortBySurname() throws MalformedURLException {
        SortRequestMessage requestBySurname = new SortRequestMessage();
        requestBySurname.setPeople(personMessageList);
        SortResponseMessage responseBySurname = client.mainWithSortBySurname(requestBySurname);
        Assert.assertEquals("Batecka",responseBySurname.getResult().get(0).getSurname());
        Assert.assertEquals("Celtycka",responseBySurname.getResult().get(1).getSurname());
    }
}