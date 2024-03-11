/**
 * ArrayOftCountryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public class ArrayOftCountryInfo  implements java.io.Serializable {
    private org.oorsprong.www.websamples_countryinfo.TCountryInfo[] tCountryInfo;

    public ArrayOftCountryInfo() {
    }

    public ArrayOftCountryInfo(
           org.oorsprong.www.websamples_countryinfo.TCountryInfo[] tCountryInfo) {
           this.tCountryInfo = tCountryInfo;
    }


    /**
     * Gets the tCountryInfo value for this ArrayOftCountryInfo.
     * 
     * @return tCountryInfo
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryInfo[] getTCountryInfo() {
        return tCountryInfo;
    }


    /**
     * Sets the tCountryInfo value for this ArrayOftCountryInfo.
     * 
     * @param tCountryInfo
     */
    public void setTCountryInfo(org.oorsprong.www.websamples_countryinfo.TCountryInfo[] tCountryInfo) {
        this.tCountryInfo = tCountryInfo;
    }

    public org.oorsprong.www.websamples_countryinfo.TCountryInfo getTCountryInfo(int i) {
        return this.tCountryInfo[i];
    }

    public void setTCountryInfo(int i, org.oorsprong.www.websamples_countryinfo.TCountryInfo _value) {
        this.tCountryInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOftCountryInfo)) return false;
        ArrayOftCountryInfo other = (ArrayOftCountryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tCountryInfo==null && other.getTCountryInfo()==null) || 
             (this.tCountryInfo!=null &&
              java.util.Arrays.equals(this.tCountryInfo, other.getTCountryInfo())));
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
        if (getTCountryInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCountryInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCountryInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOftCountryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ArrayOftCountryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCountryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryInfo"));
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
