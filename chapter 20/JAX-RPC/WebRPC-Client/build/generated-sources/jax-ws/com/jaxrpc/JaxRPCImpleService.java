
package com.jaxrpc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JaxRPCImpleService", targetNamespace = "http://JaxRPC.com/", wsdlLocation = "http://localhost:30888/WebRPC/JaxRPCImpleService?wsdl")
public class JaxRPCImpleService
    extends Service
{

    private final static URL JAXRPCIMPLESERVICE_WSDL_LOCATION;
    private final static WebServiceException JAXRPCIMPLESERVICE_EXCEPTION;
    private final static QName JAXRPCIMPLESERVICE_QNAME = new QName("http://JaxRPC.com/", "JaxRPCImpleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:30888/WebRPC/JaxRPCImpleService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JAXRPCIMPLESERVICE_WSDL_LOCATION = url;
        JAXRPCIMPLESERVICE_EXCEPTION = e;
    }

    public JaxRPCImpleService() {
        super(__getWsdlLocation(), JAXRPCIMPLESERVICE_QNAME);
    }

    public JaxRPCImpleService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JAXRPCIMPLESERVICE_QNAME, features);
    }

    public JaxRPCImpleService(URL wsdlLocation) {
        super(wsdlLocation, JAXRPCIMPLESERVICE_QNAME);
    }

    public JaxRPCImpleService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JAXRPCIMPLESERVICE_QNAME, features);
    }

    public JaxRPCImpleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JaxRPCImpleService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JaxRPCImple
     */
    @WebEndpoint(name = "JaxRPCImplePort")
    public JaxRPCImple getJaxRPCImplePort() {
        return super.getPort(new QName("http://JaxRPC.com/", "JaxRPCImplePort"), JaxRPCImple.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JaxRPCImple
     */
    @WebEndpoint(name = "JaxRPCImplePort")
    public JaxRPCImple getJaxRPCImplePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://JaxRPC.com/", "JaxRPCImplePort"), JaxRPCImple.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JAXRPCIMPLESERVICE_EXCEPTION!= null) {
            throw JAXRPCIMPLESERVICE_EXCEPTION;
        }
        return JAXRPCIMPLESERVICE_WSDL_LOCATION;
    }

}