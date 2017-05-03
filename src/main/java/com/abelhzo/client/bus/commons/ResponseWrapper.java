
package com.abelhzo.client.bus.commons;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para responseWrapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://abelhzo.commons/}messageItemJAX"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="resultslist" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseWrapper", propOrder = {
    "result",
    "resultslist"
})
public class ResponseWrapper
    extends MessageItemJAX
{

    protected Object result;
    protected List<Object> resultslist;

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResult(Object value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultslist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultslist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultslist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getResultslist() {
        if (resultslist == null) {
            resultslist = new ArrayList<Object>();
        }
        return this.resultslist;
    }

}
