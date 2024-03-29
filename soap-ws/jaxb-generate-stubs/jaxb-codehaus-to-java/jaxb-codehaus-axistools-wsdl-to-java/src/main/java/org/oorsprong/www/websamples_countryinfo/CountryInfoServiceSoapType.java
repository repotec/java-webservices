/**
 * CountryInfoServiceSoapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public interface CountryInfoServiceSoapType extends java.rmi.Remote {

    /**
     * Returns a list of continents ordered by name.
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftContinent listOfContinentsByName() throws java.rmi.RemoteException;

    /**
     * Returns a list of continents ordered by code.
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftContinent listOfContinentsByCode() throws java.rmi.RemoteException;

    /**
     * Returns a list of currencies ordered by name.
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency listOfCurrenciesByName() throws java.rmi.RemoteException;

    /**
     * Returns a list of currencies ordered by code.
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency listOfCurrenciesByCode() throws java.rmi.RemoteException;

    /**
     * Returns the name of the currency (if found)
     */
    public java.lang.String currencyName(java.lang.String sCurrencyISOCode) throws java.rmi.RemoteException;

    /**
     * Returns a list of all stored counties ordered by ISO code
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName listOfCountryNamesByCode() throws java.rmi.RemoteException;

    /**
     * Returns a list of all stored counties ordered by country name
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName listOfCountryNamesByName() throws java.rmi.RemoteException;

    /**
     * Returns a list of all stored counties grouped per continent
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent listOfCountryNamesGroupedByContinent() throws java.rmi.RemoteException;

    /**
     * Searches the database for a country by the passed ISO country
     * code
     */
    public java.lang.String countryName(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * This function tries to found a country based on the passed
     * country name.
     */
    public java.lang.String countryISOCode(java.lang.String sCountryName) throws java.rmi.RemoteException;

    /**
     * Returns the name of the captial city for the passed country
     * code
     */
    public java.lang.String capitalCity(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns the currency ISO code and name for the passed country
     * ISO code
     */
    public org.oorsprong.www.websamples_countryinfo.TCurrency countryCurrency(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns a link to a picture of the country flag
     */
    public java.lang.String countryFlag(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns the internation phone code for the passed ISO country
     * code
     */
    public java.lang.String countryIntPhoneCode(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns a struct with all the stored country information. Pass
     * the ISO country code
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryInfo fullCountryInfo(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns an array with all countries and all the language information
     * stored
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo fullCountryInfoAllCountries() throws java.rmi.RemoteException;

    /**
     * Returns a list of all countries that use the same currency
     * code. Pass a ISO currency code
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName countriesUsingCurrency(java.lang.String sISOCurrencyCode) throws java.rmi.RemoteException;

    /**
     * Returns an array of languages ordered by name
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage listOfLanguagesByName() throws java.rmi.RemoteException;

    /**
     * Returns an array of languages ordered by code
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage listOfLanguagesByCode() throws java.rmi.RemoteException;

    /**
     * Find a language name based on the passed ISO language code
     */
    public java.lang.String languageName(java.lang.String sISOCode) throws java.rmi.RemoteException;

    /**
     * Find a language ISO code based on the passed language name
     */
    public java.lang.String languageISOCode(java.lang.String sLanguageName) throws java.rmi.RemoteException;
}
