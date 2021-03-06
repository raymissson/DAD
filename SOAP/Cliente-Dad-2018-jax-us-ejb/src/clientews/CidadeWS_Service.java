
package clientews;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CidadeWS", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/Dad-2018-jax-us-ejb/CidadeWS/CidadeWS?wsdl")
public class CidadeWS_Service
    extends Service
{

    private final static URL CIDADEWS_WSDL_LOCATION;
    private final static WebServiceException CIDADEWS_EXCEPTION;
    private final static QName CIDADEWS_QNAME = new QName("http://service/", "CidadeWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Dad-2018-jax-us-ejb/CidadeWS/CidadeWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CIDADEWS_WSDL_LOCATION = url;
        CIDADEWS_EXCEPTION = e;
    }

    public CidadeWS_Service() {
        super(__getWsdlLocation(), CIDADEWS_QNAME);
    }

    public CidadeWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CIDADEWS_QNAME, features);
    }

    public CidadeWS_Service(URL wsdlLocation) {
        super(wsdlLocation, CIDADEWS_QNAME);
    }

    public CidadeWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CIDADEWS_QNAME, features);
    }

    public CidadeWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CidadeWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CidadeWS
     */
    @WebEndpoint(name = "CidadeWSPort")
    public CidadeWS getCidadeWSPort() {
        return super.getPort(new QName("http://service/", "CidadeWSPort"), CidadeWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CidadeWS
     */
    @WebEndpoint(name = "CidadeWSPort")
    public CidadeWS getCidadeWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "CidadeWSPort"), CidadeWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CIDADEWS_EXCEPTION!= null) {
            throw CIDADEWS_EXCEPTION;
        }
        return CIDADEWS_WSDL_LOCATION;
    }

}
