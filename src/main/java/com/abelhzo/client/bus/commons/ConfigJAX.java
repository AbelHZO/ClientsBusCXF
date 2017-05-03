
package com.abelhzo.client.bus.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para configJAX complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="configJAX"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iduser" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="language" type="{http://abelhzo.commons/}language"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configJAX", propOrder = {
    "iduser",
    "ip",
    "language"
})
public class ConfigJAX {

    protected long iduser;
    @XmlElement(required = true)
    protected String ip;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Language language;

    /**
     * Obtiene el valor de la propiedad iduser.
     * 
     */
    public long getIduser() {
        return iduser;
    }

    /**
     * Define el valor de la propiedad iduser.
     * 
     */
    public void setIduser(long value) {
        this.iduser = value;
    }

    /**
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

}
