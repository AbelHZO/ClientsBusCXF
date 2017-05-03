
package com.abelhzo.client.bus.roles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.abelhzo.client.bus.commons.ConfigJAX;


/**
 * <p>Clase Java para saveRolSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveRolSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigJAX" type="{http://abelhzo.commons/}configJAX"/&gt;
 *         &lt;element name="RolesAddRQ" type="{http://abelhzo.roles/}rolesAddRQ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveRolSOAP", propOrder = {
    "configJAX",
    "rolesAddRQ"
})
public class SaveRolSOAP {

    @XmlElement(name = "ConfigJAX", required = true)
    protected ConfigJAX configJAX;
    @XmlElement(name = "RolesAddRQ", required = true)
    protected RolesAddRQ rolesAddRQ;

    /**
     * Obtiene el valor de la propiedad configJAX.
     * 
     * @return
     *     possible object is
     *     {@link ConfigJAX }
     *     
     */
    public ConfigJAX getConfigJAX() {
        return configJAX;
    }

    /**
     * Define el valor de la propiedad configJAX.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigJAX }
     *     
     */
    public void setConfigJAX(ConfigJAX value) {
        this.configJAX = value;
    }

    /**
     * Obtiene el valor de la propiedad rolesAddRQ.
     * 
     * @return
     *     possible object is
     *     {@link RolesAddRQ }
     *     
     */
    public RolesAddRQ getRolesAddRQ() {
        return rolesAddRQ;
    }

    /**
     * Define el valor de la propiedad rolesAddRQ.
     * 
     * @param value
     *     allowed object is
     *     {@link RolesAddRQ }
     *     
     */
    public void setRolesAddRQ(RolesAddRQ value) {
        this.rolesAddRQ = value;
    }

}
