
package com.abelhzo.client.bus.roles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idrol" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registerdate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="updatedate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolRS", propOrder = {
    "idrol",
    "rol",
    "registerdate",
    "updatedate"
})
public class RolRS {

    protected long idrol;
    @XmlElement(required = true)
    protected String rol;
    @XmlElement(required = true)
    protected String registerdate;
    @XmlElement(required = true)
    protected String updatedate;

    /**
     * Obtiene el valor de la propiedad idrol.
     * 
     */
    public long getIdrol() {
        return idrol;
    }

    /**
     * Define el valor de la propiedad idrol.
     * 
     */
    public void setIdrol(long value) {
        this.idrol = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

    /**
     * Obtiene el valor de la propiedad registerdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterdate() {
        return registerdate;
    }

    /**
     * Define el valor de la propiedad registerdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterdate(String value) {
        this.registerdate = value;
    }

    /**
     * Obtiene el valor de la propiedad updatedate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedate() {
        return updatedate;
    }

    /**
     * Define el valor de la propiedad updatedate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedate(String value) {
        this.updatedate = value;
    }

}
