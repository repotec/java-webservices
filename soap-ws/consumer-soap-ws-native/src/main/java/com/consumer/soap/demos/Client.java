package com.consumer.soap.demos;

import java.io.IOException;

public class Client {
    public static void main( String[] args ) {
        try {
            SoapCommunication.invokeSoap();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
