package eu.glowacki.jaxws.api.sorter;

import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType( //
        name = "SortResponseMessage", // name of the XmlType should be different from the name of the class
        namespace = "http://glowacki.eu/sorter" //
)
public final class SortResponse {

    public List<Person> result;

    /**
     * empty parameterless constructor is required for unmarshalling
     */
    public SortResponse() {
    }

    public SortResponse(List<Person> result) {
        this.result = result;
    }
}