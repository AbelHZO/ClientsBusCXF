
package com.abelhzo.client.bus.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.abelhzo.client.bus.commons.ResponseWrapper;


/**
 * <p>Clase Java para getUserSOAPResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUserSOAPResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserRS" type="{http://abelhzo.commons/}responseWrapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserSOAPResponse", propOrder = {
    "userRS"
})
public class GetUserSOAPResponse {

    @XmlElement(name = "UserRS")
    protected ResponseWrapper userRS;

    /**
     * Obtiene el valor de la propiedad userRS.
     * 
     * @return
     *     possible object is
     *     {@link ResponseWrapper }
     *     
     */
    public ResponseWrapper getUserRS() {
        return userRS;
    }

    /**
     * Define el valor de la propiedad userRS.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseWrapper }
     *     
     */
    public void setUserRS(ResponseWrapper value) {
        this.userRS = value;
    }

}
