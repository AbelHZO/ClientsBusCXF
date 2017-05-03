
package com.abelhzo.client.bus.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para userUpdateRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="userUpdateRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://abelhzo.users/}userJAX"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iduser" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userUpdateRQ", propOrder = {
    "iduser"
})
public class UserUpdateRQ
    extends UserJAX
{

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
