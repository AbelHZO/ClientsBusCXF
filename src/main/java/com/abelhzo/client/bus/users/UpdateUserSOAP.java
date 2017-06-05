
package com.abelhzo.client.bus.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.abelhzo.client.bus.commons.ConfigJAX;


/**
 * <p>Clase Java para updateUserSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateUserSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigJAX" type="{http://abelhzo.commons/}configJAX"/&gt;
 *         &lt;element name="UserUpdateRQ" type="{http://abelhzo.users/}userUpdateRQ"/&gt;
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
@XmlType(name = "updateUserSOAP", propOrder = {
    "configJAX",
    "userUpdateRQ"
})
public class UpdateUserSOAP {

    @XmlElement(name = "ConfigJAX", required = true)
    protected ConfigJAX configJAX;
    @XmlElement(name = "UserUpdateRQ", required = true)
    protected UserUpdateRQ userUpdateRQ;

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
     * Obtiene el valor de la propiedad userUpdateRQ.
     * 
     * @return
     *     possible object is
     *     {@link UserUpdateRQ }
     *     
     */
    public UserUpdateRQ getUserUpdateRQ() {
        return userUpdateRQ;
    }

    /**
     * Define el valor de la propiedad userUpdateRQ.
     * 
     * @param value
     *     allowed object is
     *     {@link UserUpdateRQ }
     *     
     */
    public void setUserUpdateRQ(UserUpdateRQ value) {
        this.userUpdateRQ = value;
    }

}
