/**
 * TemperatureConversions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather;

public interface TemperatureConversions extends javax.xml.rpc.Service {

/**
 * DataFlex Web Service to convert temperature values between Celsius
 * and Fahrenheit
 */
    public java.lang.String getTemperatureConversionsSoap12Address();

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap12() throws javax.xml.rpc.ServiceException;

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getTemperatureConversionsSoapAddress();

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap() throws javax.xml.rpc.ServiceException;

    public gov.weather.TemperatureConversionsSoapType getTemperatureConversionsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
