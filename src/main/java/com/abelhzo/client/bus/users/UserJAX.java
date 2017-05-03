
package com.abelhzo.client.bus.users;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para userJAX complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="userJAX"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstlastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondlastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UserRoleAddRQ" type="{http://abelhzo.users/}userRoleAddRQ" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userJAX", propOrder = {
    "username",
    "email",
    "password",
    "birthday",
    "name",
    "firstlastname",
    "secondlastname",
    "celphone",
    "address",
    "genre",
    "active",
    "userRoleAddRQ"
})
@XmlSeeAlso({
    UserAddRQ.class,
    UserUpdateRQ.class
})
public class UserJAX {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    protected String name;
    protected String firstlastname;
    protected String secondlastname;
    protected String celphone;
    protected String address;
    protected String genre;
    protected BigDecimal active;
    @XmlElement(name = "UserRoleAddRQ", required = true)
    protected List<UserRoleAddRQ> userRoleAddRQ;

    /**
     * Obtiene el valor de la propiedad username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Define el valor de la propiedad username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad firstlastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstlastname() {
        return firstlastname;
    }

    /**
     * Define el valor de la propiedad firstlastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstlastname(String value) {
        this.firstlastname = value;
    }

    /**
     * Obtiene el valor de la propiedad secondlastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondlastname() {
        return secondlastname;
    }

    /**
     * Define el valor de la propiedad secondlastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondlastname(String value) {
        this.secondlastname = value;
    }

    /**
     * Obtiene el valor de la propiedad celphone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelphone() {
        return celphone;
    }

    /**
     * Define el valor de la propiedad celphone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelphone(String value) {
        this.celphone = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad genre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Define el valor de la propiedad genre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActive(BigDecimal value) {
        this.active = value;
    }

    /**
     * Gets the value of the userRoleAddRQ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRoleAddRQ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRoleAddRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserRoleAddRQ }
     * 
     * 
     */
    public List<UserRoleAddRQ> getUserRoleAddRQ() {
        if (userRoleAddRQ == null) {
            userRoleAddRQ = new ArrayList<UserRoleAddRQ>();
        }
        return this.userRoleAddRQ;
    }

}
