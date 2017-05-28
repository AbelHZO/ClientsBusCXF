package com.abelhzo.client.bus.roles;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-27T22:52:13.493-05:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://abelhzo.roles/", name = "RolesServiceSOAP")
@XmlSeeAlso({ObjectFactory.class, com.abelhzo.client.bus.commons.ObjectFactory.class})
public interface RolesServiceSOAP {

    @WebMethod
    @RequestWrapper(localName = "listRolSOAP", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.ListRolSOAP")
    @ResponseWrapper(localName = "listRolSOAPResponse", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.ListRolSOAPResponse")
    @WebResult(name = "RolRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper listRolSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX
    );

    @WebMethod
    @RequestWrapper(localName = "saveRolSOAP", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.SaveRolSOAP")
    @ResponseWrapper(localName = "saveRolSOAPResponse", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.SaveRolSOAPResponse")
    @WebResult(name = "RolRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper saveRolSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "RolesAddRQ", targetNamespace = "")
        com.abelhzo.client.bus.roles.RolesAddRQ rolesAddRQ
    );

    @WebMethod
    @RequestWrapper(localName = "updateRolSOAP", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.UpdateRolSOAP")
    @ResponseWrapper(localName = "updateRolSOAPResponse", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.UpdateRolSOAPResponse")
    @WebResult(name = "RolRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper updateRolSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "RolesUpdateRQ", targetNamespace = "")
        com.abelhzo.client.bus.roles.RolesUpdateRQ rolesUpdateRQ
    );

    @WebMethod
    @RequestWrapper(localName = "getRolSOAP", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.GetRolSOAP")
    @ResponseWrapper(localName = "getRolSOAPResponse", targetNamespace = "http://abelhzo.roles/", className = "com.abelhzo.client.bus.roles.GetRolSOAPResponse")
    @WebResult(name = "RolRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper getRolSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "idrol", targetNamespace = "")
        long idrol
    );
}
