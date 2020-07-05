
package eu.glowacki.jaxws.client.sorter.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.glowacki.jaxws.client.sorter.proxy package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SortByBirthDate_QNAME = new QName("http://glowacki.eu/sorter", "sortByBirthDate");
    private final static QName _SortByBirthDateResponse_QNAME = new QName("http://glowacki.eu/sorter", "sortByBirthDateResponse");
    private final static QName _SortBySurname_QNAME = new QName("http://glowacki.eu/sorter", "sortBySurname");
    private final static QName _SortBySurnameResponse_QNAME = new QName("http://glowacki.eu/sorter", "sortBySurnameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.glowacki.jaxws.client.sorter.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SortByBirthDate }
     * 
     */
    public SortByBirthDate createSortByBirthDate() {
        return new SortByBirthDate();
    }

    /**
     * Create an instance of {@link SortByBirthDateResponse }
     * 
     */
    public SortByBirthDateResponse createSortByBirthDateResponse() {
        return new SortByBirthDateResponse();
    }

    /**
     * Create an instance of {@link SortBySurname }
     * 
     */
    public SortBySurname createSortBySurname() {
        return new SortBySurname();
    }

    /**
     * Create an instance of {@link SortBySurnameResponse }
     * 
     */
    public SortBySurnameResponse createSortBySurnameResponse() {
        return new SortBySurnameResponse();
    }

    /**
     * Create an instance of {@link SortRequestMessage }
     * 
     */
    public SortRequestMessage createSortRequestMessage() {
        return new SortRequestMessage();
    }

    /**
     * Create an instance of {@link PersonMessage }
     * 
     */
    public PersonMessage createPersonMessage() {
        return new PersonMessage();
    }

    /**
     * Create an instance of {@link SortResponseMessage }
     * 
     */
    public SortResponseMessage createSortResponseMessage() {
        return new SortResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortByBirthDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortByBirthDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://glowacki.eu/sorter", name = "sortByBirthDate")
    public JAXBElement<SortByBirthDate> createSortByBirthDate(SortByBirthDate value) {
        return new JAXBElement<SortByBirthDate>(_SortByBirthDate_QNAME, SortByBirthDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortByBirthDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortByBirthDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://glowacki.eu/sorter", name = "sortByBirthDateResponse")
    public JAXBElement<SortByBirthDateResponse> createSortByBirthDateResponse(SortByBirthDateResponse value) {
        return new JAXBElement<SortByBirthDateResponse>(_SortByBirthDateResponse_QNAME, SortByBirthDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortBySurname }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortBySurname }{@code >}
     */
    @XmlElementDecl(namespace = "http://glowacki.eu/sorter", name = "sortBySurname")
    public JAXBElement<SortBySurname> createSortBySurname(SortBySurname value) {
        return new JAXBElement<SortBySurname>(_SortBySurname_QNAME, SortBySurname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortBySurnameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortBySurnameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://glowacki.eu/sorter", name = "sortBySurnameResponse")
    public JAXBElement<SortBySurnameResponse> createSortBySurnameResponse(SortBySurnameResponse value) {
        return new JAXBElement<SortBySurnameResponse>(_SortBySurnameResponse_QNAME, SortBySurnameResponse.class, null, value);
    }

}
