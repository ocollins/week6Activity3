/**
 * TemperatureConversionsSoapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather;

public interface TemperatureConversionsSoapType extends java.rmi.Remote {

    /**
     * Converts a Celsius Temperature to a Fahrenheit value
     */
    public java.math.BigDecimal celsiusToFahrenheit(java.math.BigDecimal nCelsius) throws java.rmi.RemoteException;

    /**
     * Converts a Fahrenheit Temperature to a Celsius value
     */
    public java.math.BigDecimal fahrenheitToCelsius(java.math.BigDecimal nFahrenheit) throws java.rmi.RemoteException;

    /**
     * Windchill temperature calculated with the formula of Steadman
     */
    public java.math.BigDecimal windChillInCelsius(java.math.BigDecimal nCelsius, java.math.BigDecimal nWindSpeed) throws java.rmi.RemoteException;

    /**
     * Windchill temperature calculated with the formula of Steadman
     */
    public java.math.BigDecimal windChillInFahrenheit(java.math.BigDecimal nFahrenheit, java.math.BigDecimal nWindSpeed) throws java.rmi.RemoteException;
}
