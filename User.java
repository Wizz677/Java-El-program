package chat;

public class User extends Thread {

    private String userName;
    private ChatRoom chatRoom;

    public User(String userName, ChatRoom chatRoom) {
        this.userName = userName;
        this.chatRoom = chatRoom;
    }

    @Override
    public void run() {
        chatRoom.sendMessage(userName, "Hello everyone!");
        chatRoom.sendMessage(userName, "How are you?");
        chatRoom.sendMessage(userName, "Nice to chat with you!");
    }
}
