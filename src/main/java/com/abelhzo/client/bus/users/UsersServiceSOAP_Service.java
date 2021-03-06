package com.abelhzo.client.bus.users;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-27T22:52:12.989-05:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "UsersServiceSOAP", 
                  wsdlLocation = "http://localhost:8085/UsersManagementSOAP/UsersServiceSOAP?wsdl",
                  targetNamespace = "http://abelhzo.users/") 
public class UsersServiceSOAP_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://abelhzo.users/", "UsersServiceSOAP");
    public final static QName UsersServicePortSOAP = new QName("http://abelhzo.users/", "UsersServicePortSOAP");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8085/UsersManagementSOAP/UsersServiceSOAP?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UsersServiceSOAP_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8085/UsersManagementSOAP/UsersServiceSOAP?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UsersServiceSOAP_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UsersServiceSOAP_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsersServiceSOAP_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UsersServiceSOAP_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UsersServiceSOAP_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UsersServiceSOAP_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UsersServiceSOAP
     */
    @WebEndpoint(name = "UsersServicePortSOAP")
    public UsersServiceSOAP getUsersServicePortSOAP() {
        return super.getPort(UsersServicePortSOAP, UsersServiceSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsersServiceSOAP
     */
    @WebEndpoint(name = "UsersServicePortSOAP")
    public UsersServiceSOAP getUsersServicePortSOAP(WebServiceFeature... features) {
        return super.getPort(UsersServicePortSOAP, UsersServiceSOAP.class, features);
    }

}
