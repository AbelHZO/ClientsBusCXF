
package com.abelhzo.client.bus.roles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.abelhzo.client.bus.roles package. 
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

    private final static QName _GetRolSOAP_QNAME = new QName("http://abelhzo.roles/", "getRolSOAP");
    private final static QName _GetRolSOAPResponse_QNAME = new QName("http://abelhzo.roles/", "getRolSOAPResponse");
    private final static QName _ListRolSOAP_QNAME = new QName("http://abelhzo.roles/", "listRolSOAP");
    private final static QName _ListRolSOAPResponse_QNAME = new QName("http://abelhzo.roles/", "listRolSOAPResponse");
    private final static QName _SaveRolSOAP_QNAME = new QName("http://abelhzo.roles/", "saveRolSOAP");
    private final static QName _SaveRolSOAPResponse_QNAME = new QName("http://abelhzo.roles/", "saveRolSOAPResponse");
    private final static QName _UpdateRolSOAP_QNAME = new QName("http://abelhzo.roles/", "updateRolSOAP");
    private final static QName _UpdateRolSOAPResponse_QNAME = new QName("http://abelhzo.roles/", "updateRolSOAPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.abelhzo.client.bus.roles
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRolSOAP }
     * 
     */
    public GetRolSOAP createGetRolSOAP() {
        return new GetRolSOAP();
    }

    /**
     * Create an instance of {@link GetRolSOAPResponse }
     * 
     */
    public GetRolSOAPResponse createGetRolSOAPResponse() {
        return new GetRolSOAPResponse();
    }

    /**
     * Create an instance of {@link ListRolSOAP }
     * 
     */
    public ListRolSOAP createListRolSOAP() {
        return new ListRolSOAP();
    }

    /**
     * Create an instance of {@link ListRolSOAPResponse }
     * 
     */
    public ListRolSOAPResponse createListRolSOAPResponse() {
        return new ListRolSOAPResponse();
    }

    /**
     * Create an instance of {@link SaveRolSOAP }
     * 
     */
    public SaveRolSOAP createSaveRolSOAP() {
        return new SaveRolSOAP();
    }

    /**
     * Create an instance of {@link SaveRolSOAPResponse }
     * 
     */
    public SaveRolSOAPResponse createSaveRolSOAPResponse() {
        return new SaveRolSOAPResponse();
    }

    /**
     * Create an instance of {@link UpdateRolSOAP }
     * 
     */
    public UpdateRolSOAP createUpdateRolSOAP() {
        return new UpdateRolSOAP();
    }

    /**
     * Create an instance of {@link UpdateRolSOAPResponse }
     * 
     */
    public UpdateRolSOAPResponse createUpdateRolSOAPResponse() {
        return new UpdateRolSOAPResponse();
    }

    /**
     * Create an instance of {@link RolRS }
     * 
     */
    public RolRS createRolRS() {
        return new RolRS();
    }

    /**
     * Create an instance of {@link RolesAddRQ }
     * 
     */
    public RolesAddRQ createRolesAddRQ() {
        return new RolesAddRQ();
    }

    /**
     * Create an instance of {@link RolesJAX }
     * 
     */
    public RolesJAX createRolesJAX() {
        return new RolesJAX();
    }

    /**
     * Create an instance of {@link RolesUpdateRQ }
     * 
     */
    public RolesUpdateRQ createRolesUpdateRQ() {
        return new RolesUpdateRQ();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "getRolSOAP")
    public JAXBElement<GetRolSOAP> createGetRolSOAP(GetRolSOAP value) {
        return new JAXBElement<GetRolSOAP>(_GetRolSOAP_QNAME, GetRolSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "getRolSOAPResponse")
    public JAXBElement<GetRolSOAPResponse> createGetRolSOAPResponse(GetRolSOAPResponse value) {
        return new JAXBElement<GetRolSOAPResponse>(_GetRolSOAPResponse_QNAME, GetRolSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRolSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "listRolSOAP")
    public JAXBElement<ListRolSOAP> createListRolSOAP(ListRolSOAP value) {
        return new JAXBElement<ListRolSOAP>(_ListRolSOAP_QNAME, ListRolSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRolSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "listRolSOAPResponse")
    public JAXBElement<ListRolSOAPResponse> createListRolSOAPResponse(ListRolSOAPResponse value) {
        return new JAXBElement<ListRolSOAPResponse>(_ListRolSOAPResponse_QNAME, ListRolSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRolSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "saveRolSOAP")
    public JAXBElement<SaveRolSOAP> createSaveRolSOAP(SaveRolSOAP value) {
        return new JAXBElement<SaveRolSOAP>(_SaveRolSOAP_QNAME, SaveRolSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRolSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "saveRolSOAPResponse")
    public JAXBElement<SaveRolSOAPResponse> createSaveRolSOAPResponse(SaveRolSOAPResponse value) {
        return new JAXBElement<SaveRolSOAPResponse>(_SaveRolSOAPResponse_QNAME, SaveRolSOAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRolSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "updateRolSOAP")
    public JAXBElement<UpdateRolSOAP> createUpdateRolSOAP(UpdateRolSOAP value) {
        return new JAXBElement<UpdateRolSOAP>(_UpdateRolSOAP_QNAME, UpdateRolSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRolSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://abelhzo.roles/", name = "updateRolSOAPResponse")
    public JAXBElement<UpdateRolSOAPResponse> createUpdateRolSOAPResponse(UpdateRolSOAPResponse value) {
        return new JAXBElement<UpdateRolSOAPResponse>(_UpdateRolSOAPResponse_QNAME, UpdateRolSOAPResponse.class, null, value);
    }

}
