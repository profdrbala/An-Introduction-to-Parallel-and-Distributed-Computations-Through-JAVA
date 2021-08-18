
package com.jaxrpc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "JaxRPCImple", targetNamespace = "http://JaxRPC.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JaxRPCImple {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "display", targetNamespace = "http://JaxRPC.com/", className = "com.jaxrpc.Display")
    @ResponseWrapper(localName = "displayResponse", targetNamespace = "http://JaxRPC.com/", className = "com.jaxrpc.DisplayResponse")
    @Action(input = "http://JaxRPC.com/JaxRPCImple/displayRequest", output = "http://JaxRPC.com/JaxRPCImple/displayResponse")
    public String display(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
