
package com.abelhzo.client.bus.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.abelhzo.client.bus.commons.ConfigJAX;


/**
 * <p>Clase Java para loginUserSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loginUserSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigJAX" type="{http://abelhzo.commons/}configJAX"/&gt;
 *         &lt;element name="UserLoginRQ" type="{http://abelhzo.users/}userLoginRQ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginUserSOAP", propOrder = {
    "configJAX",
    "userLoginRQ"
})
public class LoginUserSOAP {

    @XmlElement(name = "ConfigJAX", required = true)
    protected ConfigJAX configJAX;
    @XmlElement(name = "UserLoginRQ", required = true)
    protected UserLoginRQ userLoginRQ;

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
     * Obtiene el valor de la propiedad userLoginRQ.
     * 
     * @return
     *     possible object is
     *     {@link UserLoginRQ }
     *     
     */
    public UserLoginRQ getUserLoginRQ() {
        return userLoginRQ;
    }

    /**
     * Define el valor de la propiedad userLoginRQ.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLoginRQ }
     *     
     */
    public void setUserLoginRQ(UserLoginRQ value) {
        this.userLoginRQ = value;
    }

}
