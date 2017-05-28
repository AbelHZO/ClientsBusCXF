
package com.abelhzo.client.bus.commons;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.abelhzo.client.bus.commons package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.abelhzo.client.bus.commons
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseWrapper }
     * 
     */
    public ResponseWrapper createResponseWrapper() {
        return new ResponseWrapper();
    }

    /**
     * Create an instance of {@link ConfigJAX }
     * 
     */
    public ConfigJAX createConfigJAX() {
        return new ConfigJAX();
    }

    /**
     * Create an instance of {@link MessageItemJAX }
     * 
     */
    public MessageItemJAX createMessageItemJAX() {
        return new MessageItemJAX();
    }

    /**
     * Create an instance of {@link MessageJAX }
     * 
     */
    public MessageJAX createMessageJAX() {
        return new MessageJAX();
    }

}
