
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
@WebServiceClient(name = "DeviceWebServiceImplService", targetNamespace = "http://webserviceImpl.homeautomation.cynapsys.de/")
public class DeviceWebServiceImplService
    extends Service
{

    private final static URL DEVICEWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DEVICEWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DEVICEWEBSERVICEIMPLSERVICE_QNAME = new QName("http://webserviceImpl.homeautomation.cynapsys.de/", "DeviceWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://cynapsys.pagekite.me:80/HomeAutomationHibernate/DeviceWebServiceImplService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEVICEWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DEVICEWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DeviceWebServiceImplService() {
        super(__getWsdlLocation(), DEVICEWEBSERVICEIMPLSERVICE_QNAME);
    }

    public DeviceWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns DeviceWebService
     */
    @WebEndpoint(name = "DeviceWebServiceImplPort")
    public DeviceWebService getDeviceWebServiceImplPort() {
        return super.getPort(new QName("http://webserviceImpl.homeautomation.cynapsys.de/", "DeviceWebServiceImplPort"), DeviceWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeviceWebService
     */
    @WebEndpoint(name = "DeviceWebServiceImplPort")
    public DeviceWebService getDeviceWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webserviceImpl.homeautomation.cynapsys.de/", "DeviceWebServiceImplPort"), DeviceWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEVICEWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DEVICEWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return DEVICEWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}