
package com.soap.ws.client.product;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductCategoryServicePortType", targetNamespace = "http://www.delte.com/products")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductCategoryServicePortType {


    /**
     * 
     * @param productIdR
     * @return
     *     returns com.soap.ws.client.product.Product
     */
    @WebMethod(action = "getProductByIdAction")
    @WebResult(name = "getProductByIdResponse", targetNamespace = "http://www.delte.com/products")
    @RequestWrapper(localName = "getProductById", targetNamespace = "http://www.delte.com/products", className = "com.soap.ws.client.product.GetProductById")
    @ResponseWrapper(localName = "getProductByIdResponse", targetNamespace = "http://www.delte.com/products", className = "com.soap.ws.client.product.GetProductByIdResponse")
    @Action(input = "getProductByIdAction", output = "http://www.delte.com/products/ProductCategoryServicePortType/getProductByIdResponse")
    public Product getProductById(
        @WebParam(name = "productIdR", targetNamespace = "http://www.delte.com/products")
        Integer productIdR);

    /**
     * 
     * @return
     *     returns java.util.List<com.soap.ws.client.product.Product>
     */
    @WebMethod(action = "getProductsAction")
    @WebResult(name = "products", targetNamespace = "http://www.delte.com/products")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://www.delte.com/products", className = "com.soap.ws.client.product.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://www.delte.com/products", className = "com.soap.ws.client.product.GetProductsResponse")
    @Action(input = "getProductsAction", output = "http://www.delte.com/products/ProductCategoryServicePortType/getProductsResponse")
    public List<Product> getProducts();

}
