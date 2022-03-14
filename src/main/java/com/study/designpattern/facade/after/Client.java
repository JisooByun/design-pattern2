package com.study.designpattern.facade.after;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("172.15.1524");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("jisoo");
        emailMessage.setTo("doi");
        emailMessage.setSubject("test");
        emailMessage.setText("message");
        emailSender.sendEmail(emailMessage);
    }
}
