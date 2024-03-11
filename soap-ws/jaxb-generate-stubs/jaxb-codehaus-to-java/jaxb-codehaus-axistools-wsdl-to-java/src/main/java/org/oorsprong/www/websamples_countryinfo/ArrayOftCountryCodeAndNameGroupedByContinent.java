/**
 * ArrayOftCountryCodeAndNameGroupedByContinent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public class ArrayOftCountryCodeAndNameGroupedByContinent  implements java.io.Serializable {
    private org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] tCountryCodeAndNameGroupedByContinent;

    public ArrayOftCountryCodeAndNameGroupedByContinent() {
    }

    public ArrayOftCountryCodeAndNameGroupedByContinent(
           org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] tCountryCodeAndNameGroupedByContinent) {
           this.tCountryCodeAndNameGroupedByContinent = tCountryCodeAndNameGroupedByContinent;
    }


    /**
     * Gets the tCountryCodeAndNameGroupedByContinent value for this ArrayOftCountryCodeAndNameGroupedByContinent.
     * 
     * @return tCountryCodeAndNameGroupedByContinent
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] getTCountryCodeAndNameGroupedByContinent() {
        return tCountryCodeAndNameGroupedByContinent;
    }


    /**
     * Sets the tCountryCodeAndNameGroupedByContinent value for this ArrayOftCountryCodeAndNameGroupedByContinent.
     * 
     * @param tCountryCodeAndNameGroupedByContinent
     */
    public void setTCountryCodeAndNameGroupedByContinent(org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] tCountryCodeAndNameGroupedByContinent) {
        this.tCountryCodeAndNameGroupedByContinent = tCountryCodeAndNameGroupedByContinent;
    }

    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent getTCountryCodeAndNameGroupedByContinent(int i) {
        return this.tCountryCodeAndNameGroupedByContinent[i];
    }

    public void setTCountryCodeAndNameGroupedByContinent(int i, org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent _value) {
        this.tCountryCodeAndNameGroupedByContinent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOftCountryCodeAndNameGroupedByContinent)) return false;
        ArrayOftCountryCodeAndNameGroupedByContinent other = (ArrayOftCountryCodeAndNameGroupedByContinent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tCountryCodeAndNameGroupedByContinent==null && other.getTCountryCodeAndNameGroupedByContinent()==null) || 
             (this.tCountryCodeAndNameGroupedByContinent!=null &&
              java.util.Arrays.equals(this.tCountryCodeAndNameGroupedByContinent, other.getTCountryCodeAndNameGroupedByContinent())));
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
        if (getTCountryCodeAndNameGroupedByContinent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCountryCodeAndNameGroupedByContinent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCountryCodeAndNameGroupedByContinent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOftCountryCodeAndNameGroupedByContinent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ArrayOftCountryCodeAndNameGroupedByContinent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCountryCodeAndNameGroupedByContinent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndNameGroupedByContinent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndNameGroupedByContinent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
