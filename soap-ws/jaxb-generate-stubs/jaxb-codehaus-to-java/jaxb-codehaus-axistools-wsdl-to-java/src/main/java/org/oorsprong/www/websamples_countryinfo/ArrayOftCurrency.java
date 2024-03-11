/**
 * ArrayOftCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.oorsprong.www.websamples_countryinfo;

public class ArrayOftCurrency  implements java.io.Serializable {
    private org.oorsprong.www.websamples_countryinfo.TCurrency[] tCurrency;

    public ArrayOftCurrency() {
    }

    public ArrayOftCurrency(
           org.oorsprong.www.websamples_countryinfo.TCurrency[] tCurrency) {
           this.tCurrency = tCurrency;
    }


    /**
     * Gets the tCurrency value for this ArrayOftCurrency.
     * 
     * @return tCurrency
     */
    public org.oorsprong.www.websamples_countryinfo.TCurrency[] getTCurrency() {
        return tCurrency;
    }


    /**
     * Sets the tCurrency value for this ArrayOftCurrency.
     * 
     * @param tCurrency
     */
    public void setTCurrency(org.oorsprong.www.websamples_countryinfo.TCurrency[] tCurrency) {
        this.tCurrency = tCurrency;
    }

    public org.oorsprong.www.websamples_countryinfo.TCurrency getTCurrency(int i) {
        return this.tCurrency[i];
    }

    public void setTCurrency(int i, org.oorsprong.www.websamples_countryinfo.TCurrency _value) {
        this.tCurrency[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOftCurrency)) return false;
        ArrayOftCurrency other = (ArrayOftCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tCurrency==null && other.getTCurrency()==null) || 
             (this.tCurrency!=null &&
              java.util.Arrays.equals(this.tCurrency, other.getTCurrency())));
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
        if (getTCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCurrency(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOftCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ArrayOftCurrency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCurrency"));
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
