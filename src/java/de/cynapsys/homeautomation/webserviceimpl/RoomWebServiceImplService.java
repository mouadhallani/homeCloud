
package de.cynapsys.homeautomation.webserviceimpl;

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
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RoomWebServiceImplService", targetNamespace = "http://webserviceImpl.homeautomation.cynapsys.de/")
public class RoomWebServiceImplService
    extends Service
{

    private final static URL ROOMWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ROOMWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName ROOMWEBSERVICEIMPLSERVICE_QNAME = new QName("http://webserviceImpl.homeautomation.cynapsys.de/", "RoomWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://cynapsys.pagekite.me:80/HomeAutomationHibernate/RoomWebServiceImplService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROOMWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        ROOMWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public RoomWebServiceImplService() {
        super(__getWsdlLocation(), ROOMWEBSERVICEIMPLSERVICE_QNAME);
    }

    public RoomWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns RoomWebService
     */
    @WebEndpoint(name = "RoomWebServiceImplPort")
    public RoomWebService getRoomWebServiceImplPort() {
        return super.getPort(new QName("http://webserviceImpl.homeautomation.cynapsys.de/", "RoomWebServiceImplPort"), RoomWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RoomWebService
     */
    @WebEndpoint(name = "RoomWebServiceImplPort")
    public RoomWebService getRoomWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webserviceImpl.homeautomation.cynapsys.de/", "RoomWebServiceImplPort"), RoomWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROOMWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw ROOMWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return ROOMWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
