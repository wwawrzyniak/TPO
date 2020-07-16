package eu.glowacki.jaxws.api.sorter;

import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType( //
        name = "SortRequestMessage", // name of the XmlType should be different from the name of the class
        namespace = "http://glowacki.eu/sorter" //
)
public final class SortRequest {

    public List<Person> people;

    /**
     * empty parameterless constructor is required for unmarshalling
     */
    public SortRequest() {
    }

    public SortRequest(List<Person> people) {
        this.people = people;
    }
}