package com.example.nativevault;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;


public class MyRuntimeHints {

    @Autowired
    private StreamBridge bridge;

    private void retryMessages(Message<?> domainEvent, String outputChannel, int retryCount) {
        try {

            this.bridge.send(outputChannel, domainEvent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}


