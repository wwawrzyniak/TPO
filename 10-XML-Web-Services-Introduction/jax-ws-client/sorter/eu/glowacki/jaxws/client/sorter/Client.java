package eu.glowacki.jaxws.client.sorter;

import eu.glowacki.jaxws.api.IService;
import eu.glowacki.jaxws.client.sorter.proxy.*;


import javax.xml.datatype.DatatypeConfigurationException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public final class Client {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    static {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
    }


    public SortResponseMessage mainWithSortBySurname(SortRequestMessage sortRequestMessage) throws MalformedURLException {
        URL wsdl = new URL(eu.glowacki.jaxws.api.sorter.ISorter.URI + IService.WSDL_SUFFIX);
        SorterImplService service = new SorterImplService(wsdl);
        ISorter proxy = service.getISorterPort();
        SortResponseMessage result = proxy.sortBySurname(sortRequestMessage);
        return result;
    }
    public SortResponseMessage mainWithSortByBirthDate(SortRequestMessage sortRequestMessage) throws MalformedURLException {
        URL wsdl = new URL(eu.glowacki.jaxws.api.sorter.ISorter.URI + IService.WSDL_SUFFIX);
        SorterImplService service = new SorterImplService(wsdl);
        ISorter proxy = service.getISorterPort();
        SortResponseMessage result = proxy.sortByBirthDate(sortRequestMessage);
        return result;
    }
}