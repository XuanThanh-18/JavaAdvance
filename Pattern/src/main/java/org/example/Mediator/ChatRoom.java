package org.example.Mediator;

import org.example.Builder.Student;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    List<User> users = new ArrayList<User>();
    @Override
    public void sendMessage(String message, User userSend) {
        for (User u : users) {
            if(u != userSend) {
                u.receive(message, userSend);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
