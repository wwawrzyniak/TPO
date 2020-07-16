package eu.glowacki.jaxws.client.composite;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import eu.glowacki.jaxws.api.IService;
import eu.glowacki.jaxws.api.composite.Person;
import eu.glowacki.jaxws.client.composite.proxy.AddRequestMessage;
import eu.glowacki.jaxws.client.composite.proxy.AddResponseMessage;
import eu.glowacki.jaxws.client.composite.proxy.CompositeImplService;
import eu.glowacki.jaxws.client.composite.proxy.IComposite;
import eu.glowacki.jaxws.client.delayed.proxy.ServiceException_Exception;

public final class Main {

	private static final Logger LOGGER = Logger.getAnonymousLogger();

	static {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
	}

	public static void main(String... args) throws MalformedURLException, ServiceException_Exception {
		URL wsdl = new URL(eu.glowacki.jaxws.api.composite.IComposite.URI + IService.WSDL_SUFFIX);
		CompositeImplService service = new CompositeImplService(wsdl);
		IComposite proxy = service.getICompositePort();
		AddRequestMessage request = new AddRequestMessage();
		eu.glowacki.jaxws.client.composite.Person p1 = new eu.glowacki.jaxws.client.composite.Person("Ala", "Alecka", Date.valueOf("1998-01-02"));
		eu.glowacki.jaxws.client.composite.Person p2 = new eu.glowacki.jaxws.client.composite.Person("Beata", "Betecka", Date.valueOf("1991-01-02"));
		eu.glowacki.jaxws.client.composite.Person p3 = new eu.glowacki.jaxws.client.composite.Person("Celina", "Celtycka", Date.valueOf("1988-01-02"));
		eu.glowacki.jaxws.client.composite.Person p4 = new eu.glowacki.jaxws.client.composite.Person("Daniela", "Danielska", Date.valueOf("1998-01-02"));
		List<eu.glowacki.jaxws.client.composite.Person> personList = new ArrayList<eu.glowacki.jaxws.client.composite.Person>();
		personList.add(p2);
		personList.add(p3);
		personList.add(p1);
		personList.add(p4);
		request.setPeople(personList);
		request.setSortBy("Surname");
		System.out.println(request);
		AddResponseMessage response = proxy.add(request);
		for (eu.glowacki.jaxws.client.composite.Person p : response.getResult()) LOGGER.info("Person " + p.toString());

	}
}