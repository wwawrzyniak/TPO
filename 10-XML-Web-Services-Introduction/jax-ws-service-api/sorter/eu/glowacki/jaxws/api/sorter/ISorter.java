package eu.glowacki.jaxws.api.sorter;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService( //
        name = "ISorter", //
        targetNamespace = "http://glowacki.eu/sorter" //
)
public interface ISorter {

       public static final String URI = "http://localhost:8080/sorter";

        @WebMethod(action = "http://glowacki.eu/sorter/sort")
        SortResponse sortBySurname(SortRequest request);
        SortResponse sortByBirthDate(SortRequest request);

    }

