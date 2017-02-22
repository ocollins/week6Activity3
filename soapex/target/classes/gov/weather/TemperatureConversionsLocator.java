/**
 * TemperatureConversionsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather;

public class TemperatureConversionsLocator extends org.apache.axis.client.Service implements gov.weather.TemperatureConversions {

/**
 * DataFlex Web Service to convert temperature values between Celsius
 * and Fahrenheit
 */

    public TemperatureConversionsLocator() {
    }


    public TemperatureConversionsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TemperatureConversionsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TemperatureConversionsSoap12
    private java.lang.String TemperatureConversionsSoap12_address = "http://webservices.daehosting.com/services/TemperatureConversions.wso";

    public java.lang.String getTemperatureConversionsSoap12Address() {
        return TemperatureConversionsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TemperatureConversionsSoap12WSDDServiceName = "TemperatureConversionsSoap12";

    public java.lang.String getTemperatureConversionsSoap12WSDDServiceName() {
        return TemperatureConversionsSoap12WSDDServiceName;
    }

    public void setTemperatureConversionsSoap12WSDDServiceName(java.lang.String name) {
        TemperatureConversionsSoap12WSDDServiceName = name;
    }

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TemperatureConversionsSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTemperatureConversionsSoap12(endpoint);
    }

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.weather.TemperatureConversionsSoapBinding12Stub _stub = new gov.weather.TemperatureConversionsSoapBinding12Stub(portAddress, this);
            _stub.setPortName(getTemperatureConversionsSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTemperatureConversionsSoap12EndpointAddress(java.lang.String address) {
        TemperatureConversionsSoap12_address = address;
    }


    // Use to get a proxy class for TemperatureConversionsSoap
    private java.lang.String TemperatureConversionsSoap_address = "http://webservices.daehosting.com/services/TemperatureConversions.wso";

    public java.lang.String getTemperatureConversionsSoapAddress() {
        return TemperatureConversionsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TemperatureConversionsSoapWSDDServiceName = "TemperatureConversionsSoap";

    public java.lang.String getTemperatureConversionsSoapWSDDServiceName() {
        return TemperatureConversionsSoapWSDDServiceName;
    }

    public void setTemperatureConversionsSoapWSDDServiceName(java.lang.String name) {
        TemperatureConversionsSoapWSDDServiceName = name;
    }

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TemperatureConversionsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTemperatureConversionsSoap(endpoint);
    }

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.weather.TemperatureConversionsSoapBindingStub _stub = new gov.weather.TemperatureConversionsSoapBindingStub(portAddress, this);
            _stub.setPortName(getTemperatureConversionsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTemperatureConversionsSoapEndpointAddress(java.lang.String address) {
        TemperatureConversionsSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gov.weather.TemperatureConversionsSoapType.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.weather.TemperatureConversionsSoapBinding12Stub _stub = new gov.weather.TemperatureConversionsSoapBinding12Stub(new java.net.URL(TemperatureConversionsSoap12_address), this);
                _stub.setPortName(getTemperatureConversionsSoap12WSDDServiceName());
                return _stub;
            }
            if (gov.weather.TemperatureConversionsSoapType.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.weather.TemperatureConversionsSoapBindingStub _stub = new gov.weather.TemperatureConversionsSoapBindingStub(new java.net.URL(TemperatureConversionsSoap_address), this);
                _stub.setPortName(getTemperatureConversionsSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TemperatureConversionsSoap12".equals(inputPortName)) {
            return getTemperatureConversionsSoap12();
        }
        else if ("TemperatureConversionsSoap".equals(inputPortName)) {
            return getTemperatureConversionsSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "TemperatureConversions");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TemperatureConversionsSoap12".equals(portName)) {
            setTemperatureConversionsSoap12EndpointAddress(address);
        }
        else 
if ("TemperatureConversionsSoap".equals(portName)) {
            setTemperatureConversionsSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
