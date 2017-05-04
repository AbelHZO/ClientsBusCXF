package com.abelhzo.client.bus.users;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-05-03T19:15:27.059-05:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://abelhzo.users/", name = "UsersServiceSOAP")
@XmlSeeAlso({com.abelhzo.client.bus.commons.ObjectFactory.class, ObjectFactory.class})
public interface UsersServiceSOAP {

    @WebMethod
    @RequestWrapper(localName = "logoutUserSOAP", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.LogoutUserSOAP")
    @ResponseWrapper(localName = "logoutUserSOAPResponse", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.LogoutUserSOAPResponse")
    @WebResult(name = "UserRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper logoutUserSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "UserLogoutRQ", targetNamespace = "")
        com.abelhzo.client.bus.users.UserLogoutRQ userLogoutRQ
    );

    @WebMethod
    @RequestWrapper(localName = "getUserSOAP", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.GetUserSOAP")
    @ResponseWrapper(localName = "getUserSOAPResponse", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.GetUserSOAPResponse")
    @WebResult(name = "UserRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper getUserSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "iduser", targetNamespace = "")
        long iduser
    );

    @WebMethod
    @RequestWrapper(localName = "saveUserSOAP", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.SaveUserSOAP")
    @ResponseWrapper(localName = "saveUserSOAPResponse", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.SaveUserSOAPResponse")
    @WebResult(name = "UserRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper saveUserSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "UserAddRQ", targetNamespace = "")
        com.abelhzo.client.bus.users.UserAddRQ userAddRQ
    );

    @WebMethod
    @RequestWrapper(localName = "updateUserSOAP", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.UpdateUserSOAP")
    @ResponseWrapper(localName = "updateUserSOAPResponse", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.UpdateUserSOAPResponse")
    @WebResult(name = "UserRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper updateUserSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "UserUpdateRQ", targetNamespace = "")
        com.abelhzo.client.bus.users.UserUpdateRQ userUpdateRQ
    );

    @WebMethod
    @RequestWrapper(localName = "loginUserSOAP", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.LoginUserSOAP")
    @ResponseWrapper(localName = "loginUserSOAPResponse", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.LoginUserSOAPResponse")
    @WebResult(name = "UserRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper loginUserSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX,
        @WebParam(name = "UserLoginRQ", targetNamespace = "")
        com.abelhzo.client.bus.users.UserLoginRQ userLoginRQ
    );

    @WebMethod
    @RequestWrapper(localName = "listUserSOAP", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.ListUserSOAP")
    @ResponseWrapper(localName = "listUserSOAPResponse", targetNamespace = "http://abelhzo.users/", className = "com.abelhzo.client.bus.users.ListUserSOAPResponse")
    @WebResult(name = "UserRS", targetNamespace = "")
    public com.abelhzo.client.bus.commons.ResponseWrapper listUserSOAP(
        @WebParam(name = "ConfigJAX", targetNamespace = "")
        com.abelhzo.client.bus.commons.ConfigJAX configJAX
    );
}
