
package com.abelhzo.client.bus.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para userRoleJAX complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="userRoleJAX"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idrol" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRoleJAX", propOrder = {
    "idrol"
})
@XmlSeeAlso({
    UserRoleAddRQ.class
})
public class UserRoleJAX {

    protected long idrol;

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

}
