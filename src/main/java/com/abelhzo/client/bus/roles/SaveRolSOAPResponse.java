
package com.abelhzo.client.bus.roles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.abelhzo.client.bus.commons.ResponseWrapper;


/**
 * <p>Clase Java para saveRolSOAPResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveRolSOAPResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RolRS" type="{http://abelhzo.commons/}responseWrapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveRolSOAPResponse", propOrder = {
    "rolRS"
})
public class SaveRolSOAPResponse {

    @XmlElement(name = "RolRS")
    protected ResponseWrapper rolRS;

    /**
     * Obtiene el valor de la propiedad rolRS.
     * 
     * @return
     *     possible object is
     *     {@link ResponseWrapper }
     *     
     */
    public ResponseWrapper getRolRS() {
        return rolRS;
    }

    /**
     * Define el valor de la propiedad rolRS.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseWrapper }
     *     
     */
    public void setRolRS(ResponseWrapper value) {
        this.rolRS = value;
    }

}
