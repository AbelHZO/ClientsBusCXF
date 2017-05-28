
package com.abelhzo.client.bus.users;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.abelhzo.client.bus.commons.ResponseWrapper;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.abelhzo.client.bus.users package. 
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

    private final static QName _GetUserSOAP_QNAME = new QName("http://abelhzo.users/", "getUserSOAP");
    private final static QName _GetUserSOAPResponse_QNAME = new QName("http://abelhzo.users/", "getUserSOAPResponse");
    private final static QName _ListUserSOAP_QNAME = new QName("http://abelhzo.users/", "listUserSOAP");
    private final static QName _ListUserSOAPResponse_QNAME = new QName("http://abelhzo.users/", "listUserSOAPResponse");
    private final static QName _LoginUserSOAP_QNAME = new QName("http://abelhzo.users/", "loginUserSOAP");
    private final static QName _LoginUserSOAPResponse_QNAME = new QName("http://abelhzo.users/", "loginUserSOAPResponse");
    private final static QName _LogoutUserSOAP_QNAME = new QName("http://abelhzo.users/", "logoutUserSOAP");
    private final static QName _LogoutUserSOAPResponse_QNAME = new QName("http://abelhzo.users/", "logoutUserSOAPResponse");
    private final static QName _ResponseWrapper_QNAME = new QName("http://abelhzo.users/", "responseWrapper");
    private final static QName _SaveUserSOAP_QNAME = new QName("http://abelhzo.users/", "saveUserSOAP");
    private final static QName _SaveUserSOAPResponse_QNAME = new QName("http://abelhzo.users/", "saveUserSOAPResponse");
    private final static QName _UpdateUserSOAP_QNAME = new QName("http://abelhzo.users/", "updateUserSOAP");
    private final static QName _UpdateUserSOAPResponse_QNAME = new QName("http://abelhzo.users/", "updateUserSOAPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.abelhzo.client.bus.users
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserSOAP }
     * 
     */
    public GetUserSOAP createGetUserSOAP() {
        return new GetUserSOAP();
    }

    /**
     * Create an instance of {@link GetUserSOAPResponse }
     * 
     */
    public GetUserSOAPResponse createGetUserSOAPResponse() {
        return new GetUserSOAPResponse();
    }

    /**
     * Create an instance of {@link ListUserSOAP }
     * 
     */
    public ListUserSOAP createListUserSOAP() {
        return new ListUserSOAP();
    }

    /**
     * Create an instance of {@link ListUserSOAPResponse }
     * 
     */
    public ListUserSOAPResponse createListUserSOAPResponse() {
        return new ListUserSOAPResponse();
    }

    /**
     * Create an instance of {@link LoginUserSOAP }
     * 
     */
    public LoginUserSOAP createLoginUserSOAP() {
        return new LoginUserSOAP();
    }

    /**
     * Create an instance of {@link LoginUserSOAPResponse }
     * 
     */
    public LoginUserSOAPResponse createLoginUserSOAPResponse() {
        return new LoginUserSOAPResponse();
    }

    /**
     * Create an instance of {@link LogoutUserSOAP }
     * 
     */
    public LogoutUserSOAP createLogoutUserSOAP() {
        return new LogoutUserSOAP();
    }

    /**
     * Create an instance of {@link LogoutUserSOAPResponse }
     * 
     */
    public LogoutUserSOAPResponse createLogoutUserSOAPResponse() {
        return new LogoutUserSOAPResponse();
    }

    /**
     * Create an instance of {@link SaveUserSOAP }
     * 
     */
    public SaveUserSOAP createSaveUserSOAP() {
        return new SaveUserSOAP();
    }

    /**
     * Create an instance of {@link SaveUserSOAPResponse }
     * 
     */
    public SaveUserSOAPResponse createSaveUserSOAPResponse() {
        return new SaveUserSOAPResponse();
    }

    /**
     * Create an instance of {@link UpdateUserSOAP }
     * 
     */
    public UpdateUserSOAP createUpdateUserSOAP() {
        return new UpdateUserSOAP();
    }

    /**
     * Create an instance of {@link UpdateUserSOAPResponse }
     * 
     */
    public UpdateUserSOAPResponse createUpdateUserSOAPResponse() {
        return new UpdateUserSOAPResponse();
    }

    /**
     * Create an instance of {@link UserLogoutRQ }
     * 
     */
    public UserLogoutRQ createUserLogoutRQ() {
        return new UserLogoutRQ();
    }

    /**
     * Create an instance of {@link UserRS }
     * 
     */
    public UserRS createUserRS() {
        return new UserRS();
    }

    /**
     * Create an instance of {@link UserRolRS }
     * 
     */
    public UserRolRS createUserRolRS() {
        return new UserRolRS();
    }

    /**
     * Create an instance of {@link UserAddRQ }
     * 
     */
    public UserAddRQ createUserAddRQ() {
        return new UserAddRQ();
    }

    /**
     * Create an instance of {@link UserJAX }
     * 
     */
    public UserJAX createUserJAX() {
        return new UserJAX();
    }

    /**
     * Create an instance of {@link UserRoleAddRQ }
     * 
     */
    public UserRoleAddRQ createUserRoleAddRQ() {
        return new UserRoleAddRQ();
    }

    /**
     * Create an instance of {@link UserRoleJAX }
     * 
     */
    public UserRoleJAX createUserRoleJAX() {
        return new UserRoleJAX();
    }

    /**
     * Create an instance of {@link UserUpdateRQ }
     * 
     */
    public UserUpdateRQ createUserUpdateRQ() {
        return new UserUpdateRQ();
    }

    /**
     * Create an instance of {@link UserLoginRQ }
     * 
     */
    public UserLoginRQ createUserLoginRQ() {
        return new UserLoginRQ();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "getUserSOAP")
    public JAXBElement<GetUserSOAP> createGetUserSOAP(GetUserSOAP value) {
        return new JAXBElement<GetUserSOAP>(_GetUserSOAP_QNAME, GetUserSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "getUserSOAPResponse")
    public JAXBElement<GetUserSOAPResponse> createGetUserSOAPResponse(GetUserSOAPResponse value) {
        return new JAXBElement<GetUserSOAPResponse>(_GetUserSOAPResponse_QNAME, GetUserSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "listUserSOAP")
    public JAXBElement<ListUserSOAP> createListUserSOAP(ListUserSOAP value) {
        return new JAXBElement<ListUserSOAP>(_ListUserSOAP_QNAME, ListUserSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "listUserSOAPResponse")
    public JAXBElement<ListUserSOAPResponse> createListUserSOAPResponse(ListUserSOAPResponse value) {
        return new JAXBElement<ListUserSOAPResponse>(_ListUserSOAPResponse_QNAME, ListUserSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "loginUserSOAP")
    public JAXBElement<LoginUserSOAP> createLoginUserSOAP(LoginUserSOAP value) {
        return new JAXBElement<LoginUserSOAP>(_LoginUserSOAP_QNAME, LoginUserSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "loginUserSOAPResponse")
    public JAXBElement<LoginUserSOAPResponse> createLoginUserSOAPResponse(LoginUserSOAPResponse value) {
        return new JAXBElement<LoginUserSOAPResponse>(_LoginUserSOAPResponse_QNAME, LoginUserSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutUserSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "logoutUserSOAP")
    public JAXBElement<LogoutUserSOAP> createLogoutUserSOAP(LogoutUserSOAP value) {
        return new JAXBElement<LogoutUserSOAP>(_LogoutUserSOAP_QNAME, LogoutUserSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutUserSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "logoutUserSOAPResponse")
    public JAXBElement<LogoutUserSOAPResponse> createLogoutUserSOAPResponse(LogoutUserSOAPResponse value) {
        return new JAXBElement<LogoutUserSOAPResponse>(_LogoutUserSOAPResponse_QNAME, LogoutUserSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "responseWrapper")
    public JAXBElement<ResponseWrapper> createResponseWrapper(ResponseWrapper value) {
        return new JAXBElement<ResponseWrapper>(_ResponseWrapper_QNAME, ResponseWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUserSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "saveUserSOAP")
    public JAXBElement<SaveUserSOAP> createSaveUserSOAP(SaveUserSOAP value) {
        return new JAXBElement<SaveUserSOAP>(_SaveUserSOAP_QNAME, SaveUserSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUserSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "saveUserSOAPResponse")
    public JAXBElement<SaveUserSOAPResponse> createSaveUserSOAPResponse(SaveUserSOAPResponse value) {
        return new JAXBElement<SaveUserSOAPResponse>(_SaveUserSOAPResponse_QNAME, SaveUserSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "updateUserSOAP")
    public JAXBElement<UpdateUserSOAP> createUpdateUserSOAP(UpdateUserSOAP value) {
        return new JAXBElement<UpdateUserSOAP>(_UpdateUserSOAP_QNAME, UpdateUserSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.users/", name = "updateUserSOAPResponse")
    public JAXBElement<UpdateUserSOAPResponse> createUpdateUserSOAPResponse(UpdateUserSOAPResponse value) {
        return new JAXBElement<UpdateUserSOAPResponse>(_UpdateUserSOAPResponse_QNAME, UpdateUserSOAPResponse.class, null, value);
    }

}
