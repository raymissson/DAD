
package clientews;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews package. 
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

    private final static QName _ConsultarResponse_QNAME = new QName("http://service/", "consultarResponse");
    private final static QName _Consultar_QNAME = new QName("http://service/", "consultar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link Cidade }
     * 
     */
    public Cidade createCidade() {
        return new Cidade();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "consultarResponse")
    public JAXBElement<ConsultarResponse> createConsultarResponse(ConsultarResponse value) {
        return new JAXBElement<ConsultarResponse>(_ConsultarResponse_QNAME, ConsultarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consultar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "consultar")
    public JAXBElement<Consultar> createConsultar(Consultar value) {
        return new JAXBElement<Consultar>(_Consultar_QNAME, Consultar.class, null, value);
    }

}
