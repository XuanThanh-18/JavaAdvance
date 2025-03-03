package org.example.Mediator;

public interface ChatMediator {
    // send message form user to user
    void sendMessage(String message,User user);
    // add new user
    void addUser(User user);
}
