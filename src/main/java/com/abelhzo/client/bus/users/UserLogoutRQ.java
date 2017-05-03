
package com.abelhzo.client.bus.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para userLogoutRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="userLogoutRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iduser" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userLogoutRQ", propOrder = {
    "iduser"
})
public class UserLogoutRQ {

    protected long iduser;

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

}
