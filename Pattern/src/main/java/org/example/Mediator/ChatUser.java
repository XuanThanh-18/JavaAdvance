package org.example.Mediator;

public class ChatUser extends User {
    public ChatUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        System.out.println(name + "Sending message: " + message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message, User user) {
        System.out.println(name + "Receiving message: "+user.name+" : " + message);
    }
}
