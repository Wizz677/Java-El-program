import java.util.*;

class SharedBuffer {
    int num; 
    boolean empty = true;

    synchronized void put(int n) throws Exception {
        while (!empty) wait();
        num = n;
        empty = false;
        System.out.println("Producer puts :" + num);
        System.out.println("Notifying Consumer!");
        notify();
    }

    synchronized void get() throws Exception {
        while (empty) wait();
        System.out.println("Consumer receives: " + num);
        empty = true;
        System.out.println("Notifying Producer!");
        notify();
    }
}

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SharedBuffer b = new SharedBuffer();
        System.out.println("Enter the number of items");
        int n = sc.nextInt();

        new Thread(() -> {
            try {
                for (int i = 0; i < n; i++) {
                    b.put(i);
                    Thread.sleep(500);
                }
            } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < n; i++) {
                    b.get();
                    Thread.sleep(1000);
                }
            } catch (Exception e) {}
        }).start();
    }
}
