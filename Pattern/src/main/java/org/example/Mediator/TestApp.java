package org.example.Mediator;

public class TestApp {
    public static void main(String[] args) {
        ChatMediator chatroom = new ChatRoom();

        User alice = new ChatUser("Alice",chatroom);
        User bob = new ChatUser("bob",chatroom);
        User charlie = new ChatUser("charlie",chatroom);

        chatroom.addUser(alice);
        chatroom.addUser(bob);
        chatroom.addUser(charlie);

        alice.send("Hello everyone");
        bob.send("Hello alice");
    }
}
