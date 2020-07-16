package eu.glowacki.jaxws.implementation.sorter;

import eu.glowacki.jaxws.api.sorter.ISorter;
import eu.glowacki.jaxws.api.sorter.Person;
import eu.glowacki.jaxws.api.sorter.SortRequest;
import eu.glowacki.jaxws.api.sorter.SortResponse;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

@WebService( //
        name = "ISorter", //
        targetNamespace = "http://glowacki.eu/sorter" //
)
public final class SorterImpl implements ISorter {


        private static final Logger LOGGER = Logger.getAnonymousLogger();

        public static void main(String... args) {
            Endpoint.publish(ISorter.URI, new SorterImpl());
            LOGGER.info("SERVICE STARTED");
        }

        public SorterImpl() {
        }



    public SortResponse sortBySurname(SortRequest request) {
            java.util.Collections.sort(request.people);
        return new SortResponse(request.people);
    }
    public SortResponse sortByBirthDate(SortRequest request) {
        Collections.sort(request.people, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        });
        return new SortResponse(request.people);
    }
}

