/**
 * TCountryCodeAndNameGroupedByContinent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public class TCountryCodeAndNameGroupedByContinent  implements java.io.Serializable {
    private org.oorsprong.www.websamples_countryinfo.TContinent continent;

    private org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName countryCodeAndNames;

    public TCountryCodeAndNameGroupedByContinent() {
    }

    public TCountryCodeAndNameGroupedByContinent(
           org.oorsprong.www.websamples_countryinfo.TContinent continent,
           org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName countryCodeAndNames) {
           this.continent = continent;
           this.countryCodeAndNames = countryCodeAndNames;
    }


    /**
     * Gets the continent value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @return continent
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent getContinent() {
        return continent;
    }


    /**
     * Sets the continent value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @param continent
     */
    public void setContinent(org.oorsprong.www.websamples_countryinfo.TContinent continent) {
        this.continent = continent;
    }


    /**
     * Gets the countryCodeAndNames value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @return countryCodeAndNames
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName getCountryCodeAndNames() {
        return countryCodeAndNames;
    }


    /**
     * Sets the countryCodeAndNames value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @param countryCodeAndNames
     */
    public void setCountryCodeAndNames(org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName countryCodeAndNames) {
        this.countryCodeAndNames = countryCodeAndNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCountryCodeAndNameGroupedByContinent)) return false;
        TCountryCodeAndNameGroupedByContinent other = (TCountryCodeAndNameGroupedByContinent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.continent==null && other.getContinent()==null) || 
             (this.continent!=null &&
              this.continent.equals(other.getContinent()))) &&
            ((this.countryCodeAndNames==null && other.getCountryCodeAndNames()==null) || 
             (this.countryCodeAndNames!=null &&
              this.countryCodeAndNames.equals(other.getCountryCodeAndNames())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getContinent() != null) {
            _hashCode += getContinent().hashCode();
        }
        if (getCountryCodeAndNames() != null) {
            _hashCode += getCountryCodeAndNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCountryCodeAndNameGroupedByContinent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndNameGroupedByContinent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "Continent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tContinent"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCodeAndNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryCodeAndNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ArrayOftCountryCodeAndName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
