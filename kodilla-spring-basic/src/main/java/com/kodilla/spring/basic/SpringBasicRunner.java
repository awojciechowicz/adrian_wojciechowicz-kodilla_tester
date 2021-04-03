package com.kodilla.spring.basic;

import com.kodilla.spring.basic.dependency_injection.FacebookMessageService;
import com.kodilla.spring.basic.dependency_injection.MessageService;
import com.kodilla.spring.basic.dependency_injection.SimpleApplication;

public class SpringBasicRunner {
    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}
