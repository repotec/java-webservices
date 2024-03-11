package com.consumer.soap.demos;

public class PrepareRequest {
    private static final String  request = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:web=\"http://www.oorsprong.org/websamples.countryinfo\">\n" +
            "   <soap:Header/>\n" +
            "   <soap:Body>\n" +
            "      <web:ListOfContinentsByCode/>\n" +
            "   </soap:Body>\n" +
            "</soap:Envelope>";

    public static String getRequest() {
        return request;
    }
}
