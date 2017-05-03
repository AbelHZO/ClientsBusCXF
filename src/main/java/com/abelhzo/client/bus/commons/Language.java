
package com.abelhzo.client.bus.commons;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para language.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="language"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPA"/&gt;
 *     &lt;enumeration value="ENG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "language")
@XmlEnum
public enum Language {

    SPA,
    ENG;

    public String value() {
        return name();
    }

    public static Language fromValue(String v) {
        return valueOf(v);
    }

}
