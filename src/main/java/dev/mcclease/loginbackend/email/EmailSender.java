package dev.mcclease.loginbackend.email;

public interface EmailSender {
    void send(String to, String email);
}
