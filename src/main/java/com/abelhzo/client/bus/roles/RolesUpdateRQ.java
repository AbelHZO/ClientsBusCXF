
package com.abelhzo.client.bus.roles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolesUpdateRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolesUpdateRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://abelhzo.roles/}rolesJAX"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idrol" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolesUpdateRQ", propOrder = {
    "idrol"
})
public class RolesUpdateRQ
    extends RolesJAX
{

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
