
package com.abelhzo.client.bus.roles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.abelhzo.client.bus.commons.ConfigJAX;


/**
 * <p>Clase Java para updateRolSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateRolSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigJAX" type="{http://abelhzo.commons/}configJAX"/&gt;
 *         &lt;element name="RolesUpdateRQ" type="{http://abelhzo.roles/}rolesUpdateRQ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRolSOAP", propOrder = {
    "configJAX",
    "rolesUpdateRQ"
})
public class UpdateRolSOAP {

    @XmlElement(name = "ConfigJAX", required = true)
    protected ConfigJAX configJAX;
    @XmlElement(name = "RolesUpdateRQ", required = true)
    protected RolesUpdateRQ rolesUpdateRQ;

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
     * Obtiene el valor de la propiedad rolesUpdateRQ.
     * 
     * @return
     *     possible object is
     *     {@link RolesUpdateRQ }
     *     
     */
    public RolesUpdateRQ getRolesUpdateRQ() {
        return rolesUpdateRQ;
    }

    /**
     * Define el valor de la propiedad rolesUpdateRQ.
     * 
     * @param value
     *     allowed object is
     *     {@link RolesUpdateRQ }
     *     
     */
    public void setRolesUpdateRQ(RolesUpdateRQ value) {
        this.rolesUpdateRQ = value;
    }

}
