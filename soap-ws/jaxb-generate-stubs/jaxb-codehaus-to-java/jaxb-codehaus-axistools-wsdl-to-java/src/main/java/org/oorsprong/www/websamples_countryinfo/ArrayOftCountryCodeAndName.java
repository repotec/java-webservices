/**
 * ArrayOftCountryCodeAndName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public class ArrayOftCountryCodeAndName  implements java.io.Serializable {
    private org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[] tCountryCodeAndName;

    public ArrayOftCountryCodeAndName() {
    }

    public ArrayOftCountryCodeAndName(
           org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[] tCountryCodeAndName) {
           this.tCountryCodeAndName = tCountryCodeAndName;
    }


    /**
     * Gets the tCountryCodeAndName value for this ArrayOftCountryCodeAndName.
     * 
     * @return tCountryCodeAndName
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[] getTCountryCodeAndName() {
        return tCountryCodeAndName;
    }


    /**
     * Sets the tCountryCodeAndName value for this ArrayOftCountryCodeAndName.
     * 
     * @param tCountryCodeAndName
     */
    public void setTCountryCodeAndName(org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[] tCountryCodeAndName) {
        this.tCountryCodeAndName = tCountryCodeAndName;
    }

    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName getTCountryCodeAndName(int i) {
        return this.tCountryCodeAndName[i];
    }

    public void setTCountryCodeAndName(int i, org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName _value) {
        this.tCountryCodeAndName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOftCountryCodeAndName)) return false;
        ArrayOftCountryCodeAndName other = (ArrayOftCountryCodeAndName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tCountryCodeAndName==null && other.getTCountryCodeAndName()==null) || 
             (this.tCountryCodeAndName!=null &&
              java.util.Arrays.equals(this.tCountryCodeAndName, other.getTCountryCodeAndName())));
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
        if (getTCountryCodeAndName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCountryCodeAndName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCountryCodeAndName(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOftCountryCodeAndName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ArrayOftCountryCodeAndName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCountryCodeAndName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndName"));
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
