class First implements Runnable {
    public void run() {
        for (int i = 40; i <= 45; i++) {
            System.out.println("First...." + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String args[]) {
        First f = new First();
        Thread t = new Thread(f);
        t.start();
        for (int i = 50; i <= 55; i++) {
            System.out.println("Main...." + i);
        }
    }
}
