package eu.glowacki.jaxws.implementation.composite;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import eu.glowacki.jaxws.api.composite.AddRequest;
import eu.glowacki.jaxws.api.composite.AddResponse;
import eu.glowacki.jaxws.api.composite.IComposite;
import eu.glowacki.jaxws.api.composite.Person;

@WebService( //
		name = "IComposite", //
		targetNamespace = "http://glowacki.eu/composite" //
)
public final class CompositeImpl implements IComposite {

	private static final Logger LOGGER = Logger.getAnonymousLogger();

	public static void main(String... args) {
		Endpoint.publish(IComposite.URI, new CompositeImpl());
		LOGGER.info("SERVICE STARTED");
	}

	CompositeImpl() {
	}

	public AddResponse add(AddRequest request) {
		if ("Surname".equals(request.orderBy)) {
			java.util.Collections.sort(request.people);
		}
		else{
			Collections.sort(request.people, new Comparator<Person>() {
				public int compare(Person o1, Person o2) {
					return o1.getBirthDate().compareTo(o2.getBirthDate());
				}
			});
		}
		return new AddResponse(request.people);
	}
}