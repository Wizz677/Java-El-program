package chat;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private List<String> chatHistory = new ArrayList<>();

    // synchronized method → only ONE thread can enter at a time
    public synchronized void sendMessage(String user, String message) {

        String fullMessage = user + ": " + message;

        chatHistory.add(fullMessage);

        System.out.println(fullMessage);

        // Simulate delay (network / typing)
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public void showChatHistory() {
        System.out.println("\n----- CHAT HISTORY -----");
        for (String msg : chatHistory) {
            System.out.println(msg);
        }
    }
}
