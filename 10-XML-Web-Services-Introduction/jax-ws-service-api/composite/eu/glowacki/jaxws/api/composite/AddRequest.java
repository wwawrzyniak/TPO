package eu.glowacki.jaxws.api.composite;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType( //
		name = "AddRequestMessage", // name of the XmlType should be different from the name of the class
		namespace = "http://glowacki.eu/composite" //
)
public final class AddRequest {

	public List<Person> people;
	public String orderBy;

	/**
	 * empty parameterless constructor is required for unmarshalling
	 */
	public AddRequest() {
	}

	public AddRequest(List<Person> people, String orderBy) {
		this.people = people;
		this.orderBy = orderBy;
	}
}