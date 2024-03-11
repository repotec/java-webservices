/**
 * ArrayOftContinent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public class ArrayOftContinent  implements java.io.Serializable {
    private org.oorsprong.www.websamples_countryinfo.TContinent[] tContinent;

    public ArrayOftContinent() {
    }

    public ArrayOftContinent(
           org.oorsprong.www.websamples_countryinfo.TContinent[] tContinent) {
           this.tContinent = tContinent;
    }


    /**
     * Gets the tContinent value for this ArrayOftContinent.
     * 
     * @return tContinent
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent[] getTContinent() {
        return tContinent;
    }


    /**
     * Sets the tContinent value for this ArrayOftContinent.
     * 
     * @param tContinent
     */
    public void setTContinent(org.oorsprong.www.websamples_countryinfo.TContinent[] tContinent) {
        this.tContinent = tContinent;
    }

    public org.oorsprong.www.websamples_countryinfo.TContinent getTContinent(int i) {
        return this.tContinent[i];
    }

    public void setTContinent(int i, org.oorsprong.www.websamples_countryinfo.TContinent _value) {
        this.tContinent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOftContinent)) return false;
        ArrayOftContinent other = (ArrayOftContinent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tContinent==null && other.getTContinent()==null) || 
             (this.tContinent!=null &&
              java.util.Arrays.equals(this.tContinent, other.getTContinent())));
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
        if (getTContinent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTContinent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTContinent(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOftContinent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ArrayOftContinent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TContinent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tContinent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tContinent"));
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
