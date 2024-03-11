package com.consumer.soap.demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SoapCommunication {
    public static void invokeSoap() throws IOException {
        try {
            // Create SOAP request
            String soapXmlRequest = PrepareRequest.getRequest();

            // Specify URL of the SOAP web service
            URL url = new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso");

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the necessary headers
            connection.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            connection.setRequestProperty("SOAPAction", "ListOfContinentsByCode");

            // Set request method
            connection.setRequestMethod("POST");

            // Enable output
            connection.setDoOutput(true);

            // Write the SOAP request XML to the connection output stream
            try (OutputStream outputStream = connection.getOutputStream()) {
                outputStream.write(soapXmlRequest.getBytes());
            }

            // Get response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read response
            StringBuilder response = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            }

            System.out.println("Response: " + response.toString());

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
