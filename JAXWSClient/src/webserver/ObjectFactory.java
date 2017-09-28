
package webserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webserver package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _FindSailorInfoResponse_QNAME = new QName("http://webServer/", "findSailorInfoResponse");
    private final static QName _FindSailorInfo_QNAME = new QName("http://webServer/", "findSailorInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindSailorInfoResponse }
     * 
     */
    public FindSailorInfoResponse createFindSailorInfoResponse() {
        return new FindSailorInfoResponse();
    }

    /**
     * Create an instance of {@link FindSailorInfo }
     * 
     */
    public FindSailorInfo createFindSailorInfo() {
        return new FindSailorInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSailorInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webServer/", name = "findSailorInfoResponse")
    public JAXBElement<FindSailorInfoResponse> createFindSailorInfoResponse(FindSailorInfoResponse value) {
        return new JAXBElement<FindSailorInfoResponse>(_FindSailorInfoResponse_QNAME, FindSailorInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSailorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webServer/", name = "findSailorInfo")
    public JAXBElement<FindSailorInfo> createFindSailorInfo(FindSailorInfo value) {
        return new JAXBElement<FindSailorInfo>(_FindSailorInfo_QNAME, FindSailorInfo.class, null, value);
    }

}
