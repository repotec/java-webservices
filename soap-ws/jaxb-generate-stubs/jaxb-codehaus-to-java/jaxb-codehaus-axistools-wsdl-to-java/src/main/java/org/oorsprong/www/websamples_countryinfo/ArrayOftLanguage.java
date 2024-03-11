/**
 * ArrayOftLanguage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public class ArrayOftLanguage  implements java.io.Serializable {
    private org.oorsprong.www.websamples_countryinfo.TLanguage[] tLanguage;

    public ArrayOftLanguage() {
    }

    public ArrayOftLanguage(
           org.oorsprong.www.websamples_countryinfo.TLanguage[] tLanguage) {
           this.tLanguage = tLanguage;
    }


    /**
     * Gets the tLanguage value for this ArrayOftLanguage.
     * 
     * @return tLanguage
     */
    public org.oorsprong.www.websamples_countryinfo.TLanguage[] getTLanguage() {
        return tLanguage;
    }


    /**
     * Sets the tLanguage value for this ArrayOftLanguage.
     * 
     * @param tLanguage
     */
    public void setTLanguage(org.oorsprong.www.websamples_countryinfo.TLanguage[] tLanguage) {
        this.tLanguage = tLanguage;
    }

    public org.oorsprong.www.websamples_countryinfo.TLanguage getTLanguage(int i) {
        return this.tLanguage[i];
    }

    public void setTLanguage(int i, org.oorsprong.www.websamples_countryinfo.TLanguage _value) {
        this.tLanguage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOftLanguage)) return false;
        ArrayOftLanguage other = (ArrayOftLanguage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tLanguage==null && other.getTLanguage()==null) || 
             (this.tLanguage!=null &&
              java.util.Arrays.equals(this.tLanguage, other.getTLanguage())));
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
        if (getTLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTLanguage(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOftLanguage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ArrayOftLanguage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tLanguage"));
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
