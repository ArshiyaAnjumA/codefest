package com.springboot.sqlserver.service;

import com.springboot.sqlserver.entity.ProfileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(ProfileInfo emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        String template = "Hello, ${emailRequest.getName()}!\n\n"
                + "This is a message just for you, ${emailRequest.getName()}. "
                + "We hope you're having a great day!\n\n"
                + "Best regards,\n"
                + "The Spring Boot Team";

        Map<String, Object> variables = new HashMap<>();
        variables.put("firstName", "John");
        variables.put("lastName", "Doe");
        message.setTo(emailRequest.getEmail_ID());
        message.setSubject("Hello, ${emailRequest.getName()} !");
        message.setText(template);

        mailSender.send(message);
    }
}