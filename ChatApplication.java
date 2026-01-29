package chat;

public class ChatApplication {

    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        user1.start();
        user2.start();
        user3.start();

        // Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        chatRoom.showChatHistory();
    }
}
